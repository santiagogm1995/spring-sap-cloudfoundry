package com.santiago.zoo.service;

import java.util.List;

public interface RestService <T, K> {

	public List<T> getAll();
	public List<T> deepEntity(List<T> objs);
	public T getById(K obj);
	
}
