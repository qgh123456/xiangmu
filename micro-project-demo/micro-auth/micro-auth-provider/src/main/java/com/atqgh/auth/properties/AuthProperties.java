package com.atqgh.auth.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Mubai
 * @date 2022/6/30 3:41 下午
 **/
@Data
@SpringBootConfiguration
//@PropertySource(value = {"classpath:febs-auth.properties"})
@ConfigurationProperties(prefix = "micro.auth")
public class AuthProperties {

    private ClientsProperties[] clients = {};

    private int accessTokenValiditySeconds = 60 * 60 * 24;

    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;
}
