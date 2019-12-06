package cn.rpy.service;

import java.util.List;

public interface PermissionService {

    /**
     * 根据用户id查询权限
     *
     */

    List<String> queryPermissionsByUserId(Integer userId);
}
