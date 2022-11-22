package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.entity.springstudent;

public interface StudentDao {
	public int insert(springstudent student);
	public int change(springstudent student);
	public int delete(int studentId);
	public springstudent getstudent(int studentId);
	public List<springstudent> getAllStudents();

}
