package cn.rpy.service;

import cn.rpy.domain.User;

public interface UserService {

    /**
     * 根据用户名查询用户对象
     */
    User queryUserByUserName(String username);
}
