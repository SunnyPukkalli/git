package com.app.dao;

import java.util.List;

import com.app.bean.UserInfo;

public interface LoginDAO {

	
	public UserInfo findUserInfo(String username);
	
	
	public List<String> getUserRoles(String username);
}
