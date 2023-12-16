package com.in28minutes.springboot.firstWebProject.todoApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	AuthenticationService authenticationService;
	
	@Autowired
	LoginController(AuthenticationService authenticationService){
		this.authenticationService = authenticationService;
	}
	
	
	@RequestMapping("login")
	public String login() {
		logger.debug("Hey! This will we seen when debug log level is enabled");
		return "login";
	}
	
	//@RequestParam String username <- the variable name "username" should be equal to the name in the form.
	//Username: <input type ="text" name = "username"> name = "username" == String username.
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
		
		if(authenticationService.authentication(username, password)) {
			
			//fact: model we put here only works in the specific method i.e, only work in the jsp file(.welcome) in this method
			//it won't work in the another methods or other jsp files. model is valid only for this request
			//if the model call (${}) didn't work in the jsp, nothing will seen in the web page
			//to make model work across multiple methods we use @sessionAttributes annotation
			//@SessionAttributes("name")
			//put @SessionAttributes("name") in other class/controller if you want this "name" in that class or controller
			model.put("name", username); 
			model.put("password", password);
			return "welcome";
		}
		model.put("errorMessage", "Wrong username or password");
		return "login";
	}
	
}
