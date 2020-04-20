package com.tango.spring.bean.annotation.dao.impl;

import com.tango.spring.bean.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("保存用户数据");
    }
}
