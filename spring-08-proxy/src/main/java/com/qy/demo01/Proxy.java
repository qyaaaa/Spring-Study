package com.qy.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        host.rent();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fire(){
        System.out.println("收中介费");
    }

    //租赁
    public void hetong(){
        System.out.println("签租赁合同");
    }
}
