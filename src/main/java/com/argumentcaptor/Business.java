package com.argumentcaptor;

import java.util.List;

public class Business {
	Service service;

	public Business(Service service) {
		super();
		this.service = service;
	}
	public void delete(String userString) {
		List<String> combineList = service.getTodos(userString);
		for(String todo:combineList) {
			if(!todo.contains("Hibernate")) {
				service.deleteTodo(todo);
			}
		}
	}
}
