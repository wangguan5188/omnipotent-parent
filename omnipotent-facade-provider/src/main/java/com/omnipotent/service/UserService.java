package com.omnipotent.service;

import com.omnipotent.model.User;

/**
 * @author zhangtb
 *
 * @since 1.0.0
 */
public interface UserService {
	
	/**
	 * 根据用户名查询用户信息
	 * 
	 * @author zhangtb
	 * @date 2016-7-17 16:17:20
	 * @param username 用户名
	 * @return
	 */
	User queryUser(String username);

}
