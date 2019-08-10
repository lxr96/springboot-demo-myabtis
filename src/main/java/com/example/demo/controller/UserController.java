package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;

@RestController
public class UserController {
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
    @RequestMapping("list")
    public String list(){
        String s=userMapper.listAllUser().toString();
       return userMapper.listAllUser().toString();
    }
    
    @RequestMapping("add")
    public String addUser(){
    	User user = new User();
    	user.setName("lxr");
    	user.setAge("23");
        userMapper.addUser(user);
       return userMapper.listAllUser().toString();
    }
    @RequestMapping("update")
    public String updateUser(){
    	User user = new User();
    	user.setId(2);
    	user.setName("li");
    	user.setAge("23");
        userMapper.updateUserById(user);
       return userMapper.listAllUser().toString();
    }
    
    @RequestMapping("del")
    public String deleteUser(){
    	User user = new User();
    	user.setId(2);
        userMapper.deleteUserById(user);
       return userMapper.listAllUser().toString();
    }


}
