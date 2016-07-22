package com.avhr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avhr.dao.UserMapper;
import com.avhr.model.User;
import com.avhr.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

}
