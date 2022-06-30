package com.atqgh.common.config;

import com.atqgh.common.utils.SpringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoCoreConfiguration {

    @Bean
    public SpringUtils springUtils() {
        return new SpringUtils();
    }
}
