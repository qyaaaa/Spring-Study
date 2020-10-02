package com.qy.pojo;

public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User的无参构造器");
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
