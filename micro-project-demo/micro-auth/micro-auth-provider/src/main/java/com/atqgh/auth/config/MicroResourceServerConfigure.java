package com.atqgh.auth.config;

import com.atqgh.security.handler.MicroAccessDeniedHandler;
import com.atqgh.security.handler.MicroAuthExceptionEntryPoint;
import javax.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author Mubai
 * @description 访问资源，凡事需要生成token的都需要从MicroSecurityConfigure过滤器中，其他的都从该过滤器中
 * @date 2022/6/18 5:11 下午
 **/
//@Configuration
//@EnableResourceServer
//@Order(3)
public class MicroResourceServerConfigure extends ResourceServerConfigurerAdapter {

    @Resource
    private MicroAccessDeniedHandler accessDeniedHandler;

    @Resource
    private MicroAuthExceptionEntryPoint exceptionEntryPoint;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        // 配置401和403异常处理
        resources.authenticationEntryPoint(exceptionEntryPoint)
                 .accessDeniedHandler(accessDeniedHandler);
    }

}
