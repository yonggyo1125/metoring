package com.sparta.test01;

public class Member {
    private String email;
    private String name;

    public Member(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
