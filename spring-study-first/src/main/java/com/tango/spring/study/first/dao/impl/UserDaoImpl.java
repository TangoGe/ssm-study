package com.tango.spring.study.first.dao.impl;

import com.tango.spring.study.first.dao.IUserDao;

public class UserDaoImpl implements IUserDao {

    public void Test(String testName) {
        System.out.println("输出测试方法：" + testName);
    }

    public void initUserDaoImpl() {
        System.out.println("初始化 userDaoImpl");
    }

    public void destroyUserDaoImpl() {
        System.out.println("销毁 userDaoImpl:需在Context容器关闭后才执行！");
    }
}
