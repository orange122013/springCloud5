package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 在不改变各个微服务调用关系的前提下，针对错误情况进行预先处理。
 * 设计原则
 * 1 服务隔离机制
 * 2 服务降级机制
 * 3 熔断机制
 * 4 提供实时的监控和报警功能
 * 5 提供实时的配置修改功能
 *
 * Hystrix数据监控需要结合Spring Boot Actuator来使用,Actuator提供了对服务的健康监控、数据统计，
 * 可以通过Hystrix.stream节点获取监控的请求数据，同时提供了可视化的监控界面。
 * 启动成功后，访问http://localhost:8060/actuator/hystrix.stream可以监控到请求数据。
 * 访问http://localhost:8060/hystrix，可以看到可视化的监控界面，输入要监控的地址节点即可看到
 * 该节点的可视化数据监控。
 *
 *
 * Created by orange on 2020/3/21.
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker //声明启用数据监控
@EnableHystrixDashboard //声明启用可视化的数据监控
public class HystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class,args);
	}
}
