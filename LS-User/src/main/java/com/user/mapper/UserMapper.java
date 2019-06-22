package com.user.mapper;

import java.util.List;

import com.user.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String objId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String objId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List queryAll();
}