package com.in28minutes.springboot.firstWebProject.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@ResponseBody
	@RequestMapping("say-hello")
	public String sayHello() {
		return "Hello! Have you learned today";
	}
	
	@ResponseBody
	@RequestMapping("say-hello-html")
	public String sayHellohtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head></head><body> my first html page with spring</body></html>");
		return sb.toString();
	}
	
	@ResponseBody
	@RequestMapping("say-hello-html-v2")
	public String sayHellohtmlv2() {
		return "<html><head></head><body> <h3>my first html page with spring version 2</h1> </body></html>";
	}
	
	//@ResponseBody //don't add this annotation. this will return the html or string as it is. without this jpa file will be taken and executed automatic
	@RequestMapping("say-hello-jsp") //jsp stands for java server page
	public String sayHelloJSP() {
		return "sayHello"; //this is not string, this is jsp file name
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
}
