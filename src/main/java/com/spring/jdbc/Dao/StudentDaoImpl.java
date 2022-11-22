package com.spring.jdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.springstudent;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jTemp;

	public int insert(springstudent student) {

		String query = "insert into springstudent(id,name,city)values(?,?,?)";
		int r = this.jTemp.update(query, student.getId(), student.getName(), student.getCity());
		return r;

	}

	public JdbcTemplate getjTemp() {
		return jTemp;
	}

	public void setjTemp(JdbcTemplate jTemp) {
		this.jTemp = jTemp;
	}

	public int change(springstudent student) {
		String query = "update springstudent  set name = ? , city = ?  where id =?";
		int r = this.jTemp.update(query, student.getName(), student.getCity(), student.getId());

		return r;
	}

	public int delete(int studentId) {
		String query = "delete from springstudent where id = ?";
		int r = this.jTemp.update(query, studentId);
		return r;
	}

	public springstudent getstudent(int studentId) {
		String query = "select * from springstudent where id = ?";
		RowMapper<springstudent> rm = new RowMapperImpl();
		springstudent springstudent = this.jTemp.queryForObject(query, rm, studentId);
		return springstudent;
	}

	public List<springstudent> getAllStudents() {
		String query = "select * from springstudent";
		List<springstudent> stu = this.jTemp.query(query , new RowMapperImpl());
		return stu;
	}

}
