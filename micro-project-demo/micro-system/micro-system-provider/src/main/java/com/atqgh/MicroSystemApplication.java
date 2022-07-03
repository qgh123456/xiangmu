package com.atqgh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 系统资源服务启动类.
 *
 * @author Mubai
 * @date 2022/6/30 11:00 上午
 **/

@EnableDiscoveryClient
@SpringBootApplication
public class MicroSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroSystemApplication.class, args);
    }
}
