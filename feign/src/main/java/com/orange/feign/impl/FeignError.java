package com.orange.feign.impl;

import com.orange.entity.Student;
import com.orange.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by orange on 2020/3/21.
 */
@Component
public class FeignError implements FeignProviderClient{
	@Override
	public Collection<Student> findAll() {
		return null;
	}

	@Override
	public String index() {
		return "服务器维护中。。。";
	}
}
