package com.omnipotent.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnipotent.dao.UserDao;
import com.omnipotent.model.User;
import com.omnipotent.service.UserService;
import com.omnipotent.utils.MD5Util;

/**
 * @author zhangtb
 *
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User queryUser(String username, String password) {
		Map<String, Object> whereMap = new HashMap<String, Object>();
		whereMap.put("username", username);
		password = MD5Util.encode(password);
		whereMap.put("password", password);
		return userDao.queryUser(whereMap);
	}

}
