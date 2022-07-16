package com.atqgh;

import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan("com.atqgh.mapper")
public class MicroSystemApplication {

    /**
     * 系统启动类.
     * @param args 请求参数
     */
    public static void main(String[] args) {
        SpringApplication.run(MicroSystemApplication.class, args);
    }
}
