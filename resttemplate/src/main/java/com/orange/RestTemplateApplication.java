package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by orange on 2020/3/21.
 */
@SpringBootApplication
public class RestTemplateApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class,args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
