package com.in28minutes.springboot.firstWebProject.todoApplication;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") //this will carry the name attribute form the loginController to todoController 
public class TodoController {
	private TodoService todoService;
	
	TodoController(TodoService todoService){
		this.todoService = todoService;
	}
	//This method to list all the todos present in our application
	@RequestMapping("list-todos")
	public String listAllToDos(ModelMap model) {
		List <Todo> arr = todoService.findByUsername("in28minutes");
		//System.out.println(arr.get(0).description);
		model.addAttribute("todos", arr);
		return "listTodos";
	}
	//this method to add a new Todo to our application
	@RequestMapping(value = "add-todo")
	public String addTodo() {
		return "addTodo";
	}
	
	@RequestMapping(value = "add-todo" , method = RequestMethod.POST)
	public String submitAddTodo(@RequestParam String description) {
		todoService.addTodo("in28minutes", description);
		//return "listTodos"; -> this does not work as it call only the jsp page. so no list will be loaded
		//we need to redirect to the link not redirect to the jsp page
		return "redirect:list-todos";
	}
	
}
