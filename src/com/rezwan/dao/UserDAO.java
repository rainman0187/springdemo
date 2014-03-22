package com.rezwan.dao; 

import org.springframework.jdbc.core.JdbcTemplate;

import com.rezwan.model.User;

public class UserDAO   {
 
private JdbcTemplate jdbcTemplate;
 
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
 
public void deleteUser(int uid) {
	String delQuery = "delete from users where id = ?";
	int count = jdbcTemplate.update(delQuery, new Object[] { uid });
	if(count!=0)
	System.out.println("User deleted successfully.");
	else
	System.out.println("Couldn't delete user with given id as it doesn't exist");
}
 
 
 
}