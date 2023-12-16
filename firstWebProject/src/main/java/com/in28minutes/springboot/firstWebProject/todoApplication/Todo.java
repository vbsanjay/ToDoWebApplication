package com.in28minutes.springboot.firstWebProject.todoApplication;

import java.time.LocalDate;

public class Todo {
	
	int id;
	String username;
	String description;
	LocalDate targetDate;
	boolean Done;
	
	
	public Todo(int id, String username, String description, LocalDate targetDate, boolean Done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.Done = Done;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getTargetDate() {
		return targetDate;
	}


	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}


	public boolean isDone() {
		return Done;
	}


	public void setDone(boolean done) {
		Done = done;
	}
	
	
	
	
}
