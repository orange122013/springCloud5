package com.orange.controller;

import com.orange.entity.Student;
import com.orange.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by orange on 2020/3/21.
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
	@Autowired
	private FeignProviderClient feignProviderClient;

	@GetMapping("/findAll")
	public Collection<Student> findAll(){
		return feignProviderClient.findAll();
	}

	@GetMapping("/index")
	public String index(){
		return feignProviderClient.index();
	}
}
