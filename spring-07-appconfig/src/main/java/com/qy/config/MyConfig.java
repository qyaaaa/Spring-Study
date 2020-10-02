package com.qy.config;

import com.qy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//也会被spring容器托管，注册到容器中
@ComponentScan("com.qy.pojo")//配置类，相当于beans.xml
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean，相当于写的一个bean标签
    //这个方法中的名字就相当于bean标签中的id属性
    //这个方法的返回值，就相当于class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }
}
