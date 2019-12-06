package cn.rpy.service.impl;

import cn.rpy.domain.User;
import cn.rpy.mapper.UserMapper;
import cn.rpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public User queryUserByUserName(String username) {
        return userMapper.selectByUserName(username);
    }
}
