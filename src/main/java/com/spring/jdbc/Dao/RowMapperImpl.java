package com.spring.jdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.springstudent;

public class RowMapperImpl implements RowMapper<springstudent> {

	public springstudent mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		springstudent ss = new springstudent();
		ss.setId(rs.getInt(1));
		ss.setName(rs.getString(2));
		ss.setCity(rs.getString(3));
		return ss;
	}
	

}
