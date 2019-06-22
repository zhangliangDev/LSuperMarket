package com.user.mapper;

import com.user.model.UserMes;

public interface UserMesMapper {
    int deleteByPrimaryKey(String objId);

    int insert(UserMes record);

    int insertSelective(UserMes record);

    UserMes selectByPrimaryKey(String objId);

    int updateByPrimaryKeySelective(UserMes record);

    int updateByPrimaryKey(UserMes record);
}