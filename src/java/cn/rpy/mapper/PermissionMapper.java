package cn.rpy.mapper;

import cn.rpy.domain.Permission;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer perid);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer perid);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> queryPermissionsByUserId(Integer userId);
}