package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 与Ribbon一样，Feign也是由Netflix提供的，Feign是一个声明式，模板化的Web Service客户端，
 * 它简化了开发者编写Web服务客户端的操作，开发者可以通过简单的接口和注解来调用HTTP API，Spring Cloud Feign.
 * 它整合了Ribbon和Hystrix，具有可插拔、基于注解、负载均衡、服务熔断等一系列便捷功能。
 * 相比较于Ribbon + RestTemplate的方式，feign大大简化了代码的开发，Feign支持多种注解，包括feign注解、JAX-RS
 * 注解、Spring MVC注解等，SpringCloud对于Feign进行了优化，整合了Ribbon和Eureka,从而让Feign的使用更加方便。
 *
 * Ribbon和Feign的区别
 * Ribbon是一个通过的HTTP客户端工具，Feign是基于Ribbon实现的。
 *
 * Feign的特点
 * 1 Feign是一个声明式的Web Service客户端
 * 2 支持Feign注解、SpringMVC注解、JAX-RS注解
 * 3 Feign基于Ribbon实现，使用起来更加简单
 * 4 Feign集成了Hystrix,具备服务熔断功能
 *
 * feign.hystrix.enabled:是否开启熔断器
 * 创建FeignProviderClient接口的实现类FeignError,定义容错处理逻辑，
 * 通过@Component注解，将FeignError实例注入IOC容器中
 *
 * Created by orange on 2020/3/21.
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class,args);
	}
}
