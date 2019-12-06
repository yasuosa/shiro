package cn.rpy.service.impl;

import cn.rpy.domain.Permission;
import cn.rpy.domain.Role;
import cn.rpy.mapper.PermissionMapper;
import cn.rpy.mapper.RoleMapper;
import cn.rpy.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {


    @Autowired
    private PermissionMapper permissionMapper;


    public List<String> queryPermissionsByUserId(Integer userId) {
        List<Permission> permissions = permissionMapper.queryPermissionsByUserId(userId);
        List<String> permissionNames=new ArrayList<String>();
        for (Permission permission : permissions) {
            permissionNames.add(permission.getPercode());
        }
        return permissionNames;
    }
}
