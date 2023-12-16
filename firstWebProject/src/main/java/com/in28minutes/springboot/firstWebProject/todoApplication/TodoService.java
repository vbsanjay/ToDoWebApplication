package com.in28minutes.springboot.firstWebProject.todoApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	//why static? this variable need to be accessed in the static blokc
	private static List<Todo> todosList = new ArrayList<>();
	
	//why static block?
	//any method call(.add) in java should be made within a method, constructor or a block.
	//you can't call a method directly within a class.
	static {
		//ArrayList<Todo> todosList = new ArrayList<>(); <- should no do this. this variable will be accessible only within the static block. 
		//to access any variable at the class level, put the variable out of the static block.
		todosList.add( new Todo(1, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false) );
		todosList.add( new Todo(2, "in28minutes", "Go to Gym", LocalDate.now(), false) );
		todosList.add( new Todo(3, "in28minutes", "Buy Gloceries", LocalDate.now().plusYears(2), false) );
	}
	
	public List<Todo> findByUsername(String userName){
		return todosList;
	}
}
