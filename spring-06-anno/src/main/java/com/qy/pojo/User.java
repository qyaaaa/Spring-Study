package com.qy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="com.qy.pojo.User"/>
@Component//组件
@Scope("prototype")
public class User {
    @Value("qy")
    public String name;
}
