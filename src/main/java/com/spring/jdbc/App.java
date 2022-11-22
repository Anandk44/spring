package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.entity.springstudent;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("program started");
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		StudentDao st = con.getBean("std", StudentDao.class);
//		inserting data
//		springstudent s = new springstudent();
//		s.setId(117);
//		s.setName("sonam");
//		s.setCity("mumbai");
//		int res = st.insert(s);
//		
//		System.out.println("No of rows insertrd  :" + res);
//		updating data
//		springstudent s = new springstudent();
//		s.setId(115);
//		s.setName("kunal");
//		s.setCity("Aus");
//		int res = st.change(s);
//
//		System.out.println("Data changed  :" + res);
//		deleting
//		int res = st.delete(115);
//		 int res = st.delete(101);
//		res = st.delete(112);
//		res = st.delete(112);
	
//		System.out.println("no of rows deleted : " + res);
//		fetching single student data
//		springstudent s = st.getstudent(102);
//		System.out.println(s);
		List<springstudent> students = st.getAllStudents();
		for(springstudent s : students) {
			System.out.println(s);
		}
	

//       JdbcTemplate temp = con.getBean("jdbcTemplate",JdbcTemplate.class);
//       String query = "insert into springstudent(id , name , city)values(?,?,?)";
//       int res = temp.update(query , 102 , "uttam" , "kk nagar");
//       System.out.println("no of rows inserted : " + res);

	}
}
