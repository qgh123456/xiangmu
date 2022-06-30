package com.atqgh.auth.config;

import com.atqgh.auth.service.MicroUserDetailService;
import javax.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Mubai
 * @description 安全配置类.
 * 该配置类只对/oauth/开头的请求有效
 * @date 2022/6/18 5:06 下午
 **/
@Order(2)
@EnableWebSecurity
public class MicroSecurityConfigure extends WebSecurityConfigurerAdapter {

    @Resource
    private MicroUserDetailService userDetailService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 哪个路径是认证的请求,对该请求需要认证.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().antMatchers("/auth/oauth/**") // 安全配置类只对/auth/oauth/**有效
                .and()
                .authorizeRequests().antMatchers("/auth/oauth/**").authenticated() // 认证
                .and()
                .csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
    }
}
