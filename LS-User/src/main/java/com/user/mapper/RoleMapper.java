package com.user.mapper;

import com.user.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String objId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String objId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}