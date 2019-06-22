package com.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commons.constant.ResultValue;
import com.commons.constant.StatusCodes;
import com.commons.core.ResultBody;
import com.user.mapper.UserMapper;
import com.user.model.User;
import com.user.service.UserService;

@Service(value = "userService")
public class IUserServiceImpl implements UserService{

	@Autowired
	UserMapper mapper;
	
	@Override
	public ResultBody save(User u) {
		ResultBody result = new ResultBody();
		int n = mapper.insert(u);
		if(n>0) {
			result.setSuccess(true);
			result.setData(ResultValue.User.USER_REGISTRY_SUCCESS);
		}else {
			result.setSuccess(true);
			result.setCode(StatusCodes.SERVICEERRO.getCode());
			result.setData(ResultValue.User.USER_REGISTRY_FAIL);
		}
		return result;
	}

	@Override
	public List<User> queryAll() {
		return mapper.queryAll();
	}

	@Override
	public int save(Map map) {
		User u = new User();
		
		return 0;
	}

}
