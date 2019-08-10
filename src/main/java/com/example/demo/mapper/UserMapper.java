package com.example.demo.mapper;

import java.util.List;

import com.example.demo.pojo.User;

public interface UserMapper {
    List<User> listAllUser();

	int addUser(User user);

	int updateUserById(User user);

	int deleteUserById(User user);
}
