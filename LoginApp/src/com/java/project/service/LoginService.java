package com.java.project.service;

import java.util.HashMap;

import com.java.project.dto.User;

public class LoginService {
	
	HashMap<String, String> users=new HashMap<String, String>();
	public LoginService(){
		users.put("umesh", "yadav");
		users.put("ram", "krishna");
		users.put("amit", "sharma");
	}
	
	public boolean authenticate(String userId, String password){
		if(password==null || password.trim()=="" ){
			return false;
		}
		return true;
		}
	public User getUserDetails(String userId){
		User user=new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
