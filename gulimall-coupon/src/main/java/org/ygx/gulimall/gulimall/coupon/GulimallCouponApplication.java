package org.ygx.gulimall.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * nacos配置中心
 * 1.引入依赖
 * 2.bootstrap.properties
 * 3.@Value , @RefreshScope
 * 4.去配置中心新建"模块名.properties"，把配置内容搬家
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
