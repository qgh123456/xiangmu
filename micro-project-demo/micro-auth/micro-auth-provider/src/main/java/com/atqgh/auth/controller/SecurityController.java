package com.atqgh.auth.controller;

import com.atqgh.common.exception.MicroAuthException;
import com.atqgh.common.utils.ResultObj;
import java.security.Principal;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mubai
 * @description 权限的请求.
 * @date 2022/6/18 5:49 下午
 **/
@RestController
public class SecurityController {

    @Resource
    private ConsumerTokenServices consumerTokenServices;

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @DeleteMapping("signout")
    public ResultObj signout(HttpServletRequest request) throws MicroAuthException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        if (!consumerTokenServices.revokeToken(token)) {
            throw new MicroAuthException("退出登录失败");
        }
        return ResultObj.ok("退出登录成功");
    }
}
