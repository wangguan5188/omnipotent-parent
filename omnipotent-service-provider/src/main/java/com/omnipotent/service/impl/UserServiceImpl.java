package com.omnipotent.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnipotent.dao.UserDao;
import com.omnipotent.model.User;
import com.omnipotent.service.UserService;

/**
 * UserService实现类
 * 
 * @author zhangtb
 * @date 2016-8-3 20:09:18
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User queryUser(String username) {
		Map<String, Object> whereMap = new HashMap<String, Object>();
		whereMap.put("username", username);
		
		return userDao.queryUser(whereMap);
	}

}
