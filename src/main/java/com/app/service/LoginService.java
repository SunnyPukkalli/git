package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.bean.UserInfo;
import com.app.dao.LoginDAO;



@Service
public class LoginService implements UserDetailsService {

	@Autowired
	private LoginDAO loginDAO;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserInfo user = loginDAO.findUserInfo(username);
		
		if(user == null){
			throw new UsernameNotFoundException("user name does not exist");
		}
		
		List<String> roles = loginDAO.getUserRoles(username);
		
		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		if(roles != null){
			for(String role : roles){
				GrantedAuthority authority = new SimpleGrantedAuthority(role);
				grantList.add(authority);
			}
		}
		
		System.out.println(">>"+user.getUsername());
		System.out.println(">>>"+user.getPassword());
		System.out.println(">>"+grantList);
		
		UserDetails userDetails = new User(user.getUsername(), user.getPassword(), grantList);
		
		return userDetails;
	}

}
