package com.tango.spring.bean.xml.domain;

import java.util.List;

public class User {
    private String username;//姓名
    private int age;//年龄
    private String password; //密码
    private List<String> waihao;//外号

    public User() {
        super();
    }

    public User(String username, int age, String password, List<String> waihao) {
        this.username = username;
        this.age = age;
        this.password = password;
        this.waihao = waihao;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getWaihao() {
        return waihao;
    }

    public void setWaihao(List<String> waihao) {
        this.waihao = waihao;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", waihao=" + waihao +
                '}';
    }
}
