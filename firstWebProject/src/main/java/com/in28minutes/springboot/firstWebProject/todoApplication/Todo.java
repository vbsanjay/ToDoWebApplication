package com.in28minutes.springboot.firstWebProject.todoApplication;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
	
	private int id;
	private String username;
	private String Description;
	private LocalDate targetDate;
	private boolean isDone;
	
	
	public Todo(int id, String username, String description, LocalDate targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		Description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	
	
	
}
