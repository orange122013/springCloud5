package com.orange.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by orange on 2020/3/18.
 */
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Student implements Serializable{
	private long id;
	private String name;
	private int age;

	public Student(){

	}

	public Student(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
