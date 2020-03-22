package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by orange on 2020/3/21.
 */
//zuul自动了负载均衡功能，修改provider实例
@EnableZuulProxy //包含了@EnableZuulServer,设置该类是网关的启动类
@EnableAutoConfiguration
//可以帮助Srping Boot应用将所有符合条件的@Configuration配置加载到当前Spring Boot创建并使用的IOC容器中。
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class,args);
	}
}
