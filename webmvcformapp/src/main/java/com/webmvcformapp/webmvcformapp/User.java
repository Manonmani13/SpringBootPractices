package com.webmvcformapp.webmvcformapp;

public class User {
    private String name;

    private String email;

    private Long phno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", phno=" + phno + "]";
    }

    
}
