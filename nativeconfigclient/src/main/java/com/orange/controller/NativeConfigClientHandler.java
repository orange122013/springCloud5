package com.orange.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by orange on 2020/3/22.
 */
@RestController
@RequestMapping("/native")
public class NativeConfigClientHandler {

	@Value("${server.port}")
	private String port;

	@Value("${foo}")
	private String foo;

	@GetMapping("/index")
	public String index(){
		return this.port + "-" + this.foo;
	}
}
