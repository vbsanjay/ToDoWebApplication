package com.in28minutes.springboot.firstWebProject.todoApplication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authentication(String username, String password) {
		//write a condition to check if the given password and username matches with your password
		if(username.equalsIgnoreCase("in28minute") && password.equalsIgnoreCase("dummy")) {
			return true;
		}
		return false;
	}
}
