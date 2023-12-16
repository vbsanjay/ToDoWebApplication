package com.in28minutes.springboot.firstWebProject.todoApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
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
			model.put("name", username);
			model.put("password", password);
			return "welcome";
		}
		model.put("errorMessage", "Wrong username or password");
		return "login";
	}
	
}
