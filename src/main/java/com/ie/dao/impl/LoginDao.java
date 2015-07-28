package com.ie.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.ie.bean.LoginMsg;
import com.ie.dao.AbstractDao;

@Repository
public class LoginDao implements AbstractDao {

	@Autowired  
	private MongoTemplate mongoTemplate;  
	private final String LOGIN_COLLECTION_NAME = "LoginMsg";
	 
	@Override
	public void insert(Object obj) {
		// TODO Auto-generated method stub
		mongoTemplate.save(obj, LOGIN_COLLECTION_NAME);
	}

	@Override
	public Object findOne(String id, String fieldName) {
		// TODO Auto-generated method stub
		return mongoTemplate.findOne(new Query(Criteria.where(fieldName).is(id)), LoginMsg.class, LOGIN_COLLECTION_NAME);
	}

	@Override
	public List<?> findAll() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(LoginMsg.class, LOGIN_COLLECTION_NAME);
	}

	@Override
	public List<?> findByRegex(String regex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeOne(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findAndModify(String id) {
		// TODO Auto-generated method stub

	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
