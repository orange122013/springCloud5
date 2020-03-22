package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by orange on 2020/3/21.
 */
@SpringBootApplication
public class RibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class,args);
	}

	@Bean
	@LoadBalanced //声明一个基于Ribbon的负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
