package com.orange.controller;

import com.orange.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Created by orange on 2020/3/21.
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("findAll")
	public Collection<Student> findAll(){
		return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
	}
	@RequestMapping("findAll2")
	public Collection<Student> findAll2(){
		return restTemplate.getForObject("http://gateway/p/student/findAll",Collection.class);
	}
	@RequestMapping("index")
	public String index(){
		return restTemplate.getForObject("http://provider/student/index",String.class);
	}
	@RequestMapping("index2")
	public String index2(){
		return restTemplate.getForObject("http://gateway/p/student/index",String.class);
	}
}
