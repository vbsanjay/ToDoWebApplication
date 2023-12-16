package com.in28minutes.springboot.firstWebProject.todoApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") //this will carry the name attribute form the loginController to todoController 
public class TodoController {
	private TodoService todoService;
	
	TodoController(TodoService todoService){
		this.todoService = todoService;
	}
	@RequestMapping("list-todos")
	public String showToDoPage(ModelMap model) {
		model.put("todos",todoService.findByUsername("in28minutes"));
		return "todos";
	}
}
