package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * bootstrap.yml，配置读取本地配置中心的相关信息。
 * cloud.config.uri:本地Config Server的访问路径
 * cloud.config.fail-fase:设置客户端有限判断Config Server获取是否正常
 * 通过spring.application.name结合spring.profiles.active拼接目标配置文件名，configclient-dev.yml，
 * 去Config Server中查找该文件。
 *
 * Created by orange on 2020/3/22.
 */
@SpringBootApplication
public class NativeConfigClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(NativeConfigClientApplication.class,args);
	}
}
