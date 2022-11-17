package org.ygx.gulimall.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * nacos注册中心
 * 1.引依赖
 * 2.application.properties(yml)配置server-addr和application-name
 * 3.@EnableDiscoveryClient
 */

/**
 * openfeign
 * 1.引依赖
 * 2.编写接口(feign包)声明需要调用的服务
 * 3.@EnableFeignClients
 */

@EnableFeignClients(basePackages = "org.ygx.gulimall.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
