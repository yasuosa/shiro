package cn.rpy.service.impl;

import cn.rpy.domain.Role;
import cn.rpy.mapper.RoleMapper;
import cn.rpy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<String> queryRolesByUserId(Integer id) {
        List<String> rolenames=new ArrayList<String>();
        List<Role> roles = roleMapper.queryRolesByUserId(id);
        for (Role role : roles) {
            rolenames.add(role.getRolename());
        }
        return rolenames;
    }
}
