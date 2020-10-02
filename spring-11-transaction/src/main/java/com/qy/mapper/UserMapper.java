package com.qy.mapper;

import com.qy.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    //增加一个用户
    public int addUser(User user);

    //删除一个用户
    public int deleteUser(int id);
}
