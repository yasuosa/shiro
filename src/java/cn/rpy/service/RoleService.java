package cn.rpy.service;

import java.util.List;

public interface RoleService {

    /**
     * 根据用户名id 查询角色
     */
    List<String> queryRolesByUserId(Integer id);
}
