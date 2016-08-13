package com.omnipotent.model;

import java.io.Serializable;

/**
 * @author zhangtb
 * @date 2016年8月13日 下午10:02:54
 * @since 1.0.0
 */
public class User implements Serializable {

	private static final long serialVersionUID = 2742982761847122161L;
	
	private Integer id;
	private String username;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
