package com.in28minutes.springboot.firstWebProject.todoApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("login")
	public String login(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("This will be printed at debug level");
		logger.info("This will be printed at info level along with name. My name is {}",name);
		logger.warn("This is at warn level");
		return "login";
	}
}
