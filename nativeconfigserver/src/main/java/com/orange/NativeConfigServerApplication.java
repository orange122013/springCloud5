package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config，通过服务端可以为多个客户端提供配置服务。Spring Cloud Config 可以配置文件存储在本地。
 * 也可以将配置文件存储在远程Git仓库，创建Config Server,通过它管理所有的配置文件。
 *
 * profiles.active：配置文件的获取方式
 * cloud.config.server.native.search-location:本地配置文件的存放路径
 * Created by orange on 2020/3/22.
 */
@SpringBootApplication
@EnableConfigServer //声明配置中心
public class NativeConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NativeConfigServerApplication.class,args);
	}
}
