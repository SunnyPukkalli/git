package com.app.bean;

import java.sql.Date;

public class UserInfo {

	
	private String username;
	private String password;
	private Date created_on;
	private Date start_date;
	private Date end_date;
	
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
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password + ", created_on=" + created_on
				+ ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	
}
