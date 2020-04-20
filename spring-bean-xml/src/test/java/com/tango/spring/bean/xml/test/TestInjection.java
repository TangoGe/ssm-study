package com.tango.spring.bean.xml.test;


import com.tango.spring.bean.xml.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestInjection {
    @Test
    public void testUserInjection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context-xml.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
}
