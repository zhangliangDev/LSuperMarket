package com.user.service;

import java.util.List;
import java.util.Map;

import com.commons.core.ResultBody;
import com.user.model.User;


public interface UserService {

	ResultBody save(User u);
	
	int save(Map map);
	
	List<User> queryAll();
}
