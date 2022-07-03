package com.atqgh.security.service;

import com.alibaba.fastjson.TypeReference;
import com.atqgh.common.constants.Constants;
import com.atqgh.common.constants.JWTConstants;
import com.atqgh.common.utils.ResultObj;
import com.atqgh.security.feign.UserFeignClient;
import com.atqgh.system.dto.SysUserDto;
import dto.SysUserDto;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @path：com.blog.service.impl.UserDetailsServiceImpl.java
 * @className：UserDetailsServiceImpl.java
 * @description：自定义用户认证和授权
 * @author：tanyp
 * @dateTime：2020/11/9 15:44
 * @editNote：
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserFeignClient userFeignClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 通过用户名查找用户信息
        ResultObj result = userFeignClient.findByUsername(username);
        if (!result.getCode().equals(Constants.SUCCESS)) {
            throw new UsernameNotFoundException("用户:" + username + ",不存在!");
        }

        Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
        SysUserDto userTo = result.getData(new TypeReference<SysUserDto>(){});

        result = this.userFeignClient.getRoleByUserId(String.valueOf(userTo.getId()));
//        Wrapper<List<RoleVo>> roleInfo = this.userFeignClient.getRoleByUserId(String.valueOf(userTo.getId()));
        if (result.getCode().equals(Constants.SUCCESS)) {
            List<RoleTo> roleVoList = result.getData(new TypeReference<List<RoleTo>>(){});

            for (RoleTo role : roleVoList) {
                // 角色必须是ROLE_开头，可以在数据库中设置
                SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(JWTConstants.ROLE_PREFIX + role.getValue());
                grantedAuthorities.add(grantedAuthority);

                // 获取权限
                result = userFeignClient.getRolePermission(String.valueOf(role.getId()));
                if (result.getCode().equals(Constants.SUCCESS)) {
                    List<MenuTo> permissionList = result.getData(new TypeReference<List<MenuTo>>(){});
                    for (MenuTo menu : permissionList) {
                        if (!StringUtils.isEmpty(menu.getUrl())) {
                            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(menu.getUrl());
                            grantedAuthorities.add(authority);
                        }
                    }
                }
            }
        }

        AuthUser user = new AuthUser(userTo.getUsername(), userTo.getPassword(), grantedAuthorities);
        user.setId(userTo.getId());
        return user;
    }

}
