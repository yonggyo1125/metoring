package com.example.demo.test01;

public class Member {
    private String email;
    private String name;

    public Member() {}

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        System.out.println("setName() 호출:" + name);
        this.name = name;
    }

    public void setEmail(String email) {
        System.out.println("setEmail() 호출:" + email);
        this.email = email;
    }
}
