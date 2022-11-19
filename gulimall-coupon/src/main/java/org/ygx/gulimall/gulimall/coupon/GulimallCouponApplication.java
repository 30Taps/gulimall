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
 *
 * 命名空间：默认public（保留空间）
 * 在nacos创建新的命名空间会生成uuid
 * bootstrap
 * config.namespace="uuid"
 *
 * 配置组:默认DEFAULT_GROUP
 * bootstrap
 * config.group
 *
 * 加载多个配置集：避免application过大可读性差，分开放入nacos配置中心
 * config.ext-config[i].data-id=
 *                     .group=
 *                     .refresh=
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
