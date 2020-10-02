package com.qy.pojo;

public class UserT {
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

    public UserT(String name) {
        this.name = name;
    }

    public UserT() {
        System.out.println("UserT的无参构造器");
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
