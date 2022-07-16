package com.atqgh.service.impl;

import com.atqgh.common.utils.ResultObj;
import com.atqgh.entity.SysUser;
import com.atqgh.security.domain.LoginUserDetailDto;
import com.atqgh.security.utils.JwtUtil;
import com.atqgh.security.utils.RedisCache;
import com.atqgh.service.LoginServcie;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * 登录接口.
 * @author Mubai
 * @date 2022/7/9 9:46 下午
 **/
@Service
public class LoginServcieImpl implements LoginServcie {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public ResultObj login(SysUser sysUser) {

        // 1，获取AuthenticationManager
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(sysUser.getUserName(), sysUser.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        // 如果没有认证通过，则报异常
        if (ObjectUtils.isEmpty(authenticate)) {
            throw new RuntimeException("登陆失败");
        }

        // 如果认证通过了，则使用jwt生成一个jwt，返回
        LoginUserDetailDto loginUser = (LoginUserDetailDto) authenticate.getPrincipal();
        String userId = loginUser.getLoginSysUserDto().toString();
        // 把完整对象存入redis中
        String jwt = JwtUtil.createJWT(userId);
        // 把完整的用户信息存入redis中，userId作为key
        Map<String, String> map = new HashMap<>();

        map.put("token", jwt);
        redisCache.setCacheObject("login:" + userId, loginUser);

        // 查询对应的权限信息
        return ResultObj.ok().setData(map);
    }

    @Override
    public ResultObj logout() {

        // 获取SecurityContextHolder中的id
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUserDetailDto loginUser = (LoginUserDetailDto) authentication.getPrincipal();
        Long userId = loginUser.getLoginSysUserDto().getUserId();

        redisCache.deleteObject("login:" + userId);
        return ResultObj.ok();
    }
}
