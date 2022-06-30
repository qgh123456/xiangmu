package com.atqgh.auth.service;

import com.atqgh.auth.entity.MicroAuthUser;
import javax.annotation.Resource;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author Mubai
 * @description 获取用户的详细信息.
 * @date 2022/6/18 5:39 下午
 **/
@Service
public class MicroUserDetailService implements UserDetailsService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MicroAuthUser microAuthUser = new MicroAuthUser();
        microAuthUser.setUsername(username);
        microAuthUser.setPassword(this.passwordEncoder.encode("123456"));
        return new User(username, microAuthUser.getPassword(), microAuthUser.isEnabled(),
                microAuthUser.isAccountNonExpired(), microAuthUser.isCredentialsNonExpired(),
                microAuthUser.isAccountNonLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList("user:add"));
    }
}
