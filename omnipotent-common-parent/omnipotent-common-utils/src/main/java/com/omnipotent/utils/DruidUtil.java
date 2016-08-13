package com.omnipotent.utils;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;

/**
 * Druid实现数据库连接用户密码加密
 * 
 * @author zhangtb
 * @date 2016-7-11 20:25:12
 * @since 1.0.0
 */
public class DruidUtil extends DruidDataSource {

	private static final long serialVersionUID = -1385151091182035930L;

	// 用来解密配置中的密文(重点配置，在这里扩展用户名的解密) setUsername(name)
	// 方法对应xml中的一个property属性，password默认加密不需要重写， 还可以加密url 重写setUrl(url)
	@Override
	public void setUsername(String username) {
		try {
			username = ConfigTools.decrypt(username);
			System.out.println(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.setUsername(username);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			String encrypt = ConfigTools.encrypt("123456");
			// Biyu5YzU+6sxDRbmWEa3B2uUcImzDo0BuXjTlL505+/pTb+/0Oqd3ou1R6J8+9Fy3CYrM18nBDqf6wAaPgUGOg==
			System.out.println(encrypt);
			
			String username = "ZDCKZBoQ0RXQHS1ighcK+QjT/FGcqk4lgh5L4eMmy809VZyMAw0XjxlVmoVV1vReFRrbgNuEyWZ7buTScaWopA==";
			new DruidUtil().setUsername(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
