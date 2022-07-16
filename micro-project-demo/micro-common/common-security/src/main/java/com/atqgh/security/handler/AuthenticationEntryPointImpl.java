package com.atqgh.security.handler;

import com.alibaba.fastjson.JSON;
import com.atqgh.common.utils.ResultObj;
import com.atqgh.security.utils.WebUtils;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * 当前用户名或密码错误.
 * @author Mubai
 * @date 2022/7/10 4:14 下午
 **/
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        WebUtils.renderString(response, JSON.toJSONString(ResultObj.error(HttpStatus.UNAUTHORIZED.value(), "认证失败请重新登录")));
    }
}
