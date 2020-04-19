package com.tango.spring.study.first.factory;

import com.tango.spring.study.first.dao.IUserDao;
import com.tango.spring.study.first.dao.impl.UserDaoImpl;

/**
 * 工厂类
 */
public class DaoFactory {
    public IUserDao getUserDao() {
        return new UserDaoImpl();
    }
}
