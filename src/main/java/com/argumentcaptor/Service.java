package com.argumentcaptor;

import java.util.List;

public interface Service {
	public List<String> getTodos(String user);
	public void deleteTodo(String doString);
}
