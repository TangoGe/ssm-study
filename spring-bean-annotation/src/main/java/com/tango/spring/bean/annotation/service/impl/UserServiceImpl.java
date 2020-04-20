package com.tango.spring.bean.annotation.service.impl;

import com.tango.spring.bean.annotation.dao.UserDao;
import com.tango.spring.bean.annotation.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")//当容器中注入多个相同类型的实例时，通过name便于寻找
    private UserDao userDao;

    public void save() {
        userDao.save();
    }
}
