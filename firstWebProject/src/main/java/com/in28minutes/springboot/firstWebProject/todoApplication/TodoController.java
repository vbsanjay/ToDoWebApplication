package com.in28minutes.springboot.firstWebProject.todoApplication;

import java.util.List;

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
	public String listAllToDos(ModelMap model) {
		List <Todo> arr = todoService.findByUsername("in28minutes");
		//System.out.println(arr.get(0).description);
		model.addAttribute("todos", arr);
		return "listTodos";
	}
}
