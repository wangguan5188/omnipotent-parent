package com.omnipotent.dao;

import java.util.Map;

import com.omnipotent.model.User;

/**
 * @author zhangtb
 *
 * @since 1.0.0
 */
public interface UserDao {
	
	/**
	 * 根据用户名和密码查询用户信息
	 * 
	 * @author zhangtb
	 * @date 2016-7-17 16:17:20
	 * @param whereMap 查询条件封装
	 * @return
	 */
	User queryUser(Map<String, Object> whereMap);

}
