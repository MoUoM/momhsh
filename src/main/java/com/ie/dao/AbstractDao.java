package com.ie.dao;

import java.util.List;

public interface AbstractDao {

	public void insert(Object obj);
	
	public Object findOne(String id, String fieldName);
	
	public List<?> findAll();
	
	public List<?> findByRegex(String regex);
	
	public void removeAll();
	
	public void removeOne(String id);
	
	public void findAndModify(String id);
	
}
