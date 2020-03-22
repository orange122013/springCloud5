package com.orange.feign;

import com.orange.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * 在FeignProviderClient定义处通过@FeignClient的fallback属性设置映射
 * Created by orange on 2020/3/21.
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {
	@GetMapping("/student/findAll")
	public Collection<Student> findAll();
	@GetMapping("/student/index")
	public String index();
}
