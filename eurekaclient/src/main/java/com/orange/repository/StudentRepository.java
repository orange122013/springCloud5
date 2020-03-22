package com.orange.repository;

import com.orange.entity.Student;

import java.util.Collection;

/**
 * Created by orange on 2020/3/19.
 */
public interface StudentRepository {
	public Collection<Student> findAll();
	public Student findById(long id);
	public void saveOrUpdate(Student student);
	public void deleteById(long id);
}
