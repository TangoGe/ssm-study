package com.tango.spring.study.first.domain;

/**
 * 用户类
 */
public class User {
    private String userName;//用户姓名
    private String age;//年龄
    private String password;//密码

    public  User(){
        super();
    }

    public User(String userName, String age, String password) {

        this.age = age;
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
