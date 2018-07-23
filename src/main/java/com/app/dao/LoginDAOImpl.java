package com.app.dao;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.app.bean.UserInfo;


@Repository
public class LoginDAOImpl implements LoginDAO {

	
	private DataSource dataSource;
	private NamedParameterJdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}
	
	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate  = new NamedParameterJdbcTemplate(dataSource);
	}

	private SqlParameterSource getSqlParameterByModel(String username , String password, Date created_on , Date start_date, Date end_date){
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("username",username);
		paramSource.addValue("password", password);
		paramSource.addValue("created_on", created_on);
		paramSource.addValue("start_date", start_date);
		paramSource.addValue("end_date", end_date);		
		return paramSource;
	}
	
	private SqlParameterSource getSqlParameterByModel(String username){
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("username",username);		
		return paramSource;
	}

	
	private static final class UserInfoRowMapper implements RowMapper<UserInfo>
	{
		
		public UserInfo mapRow(ResultSet rs, int rwoNum) throws SQLException {

			String username = rs.getString("username");
			String password = rs.getString("password");
			//Date created_on = rs.getDate("created_on");
			//Date start_date = rs.getDate("password");
			//Date end_date = rs.getDate("password");
			
			
			UserInfo user =  new UserInfo();
			user.setPassword(password);
			user.setUsername(username);
			//user.setCreated_on(created_on);
			//user.setStart_date(start_date);
			//user.setEnd_date(end_date);
			return user;
		}
	}
	
	@Override
	public UserInfo findUserInfo(String username) {
		
		String query = " select * from app_users where username = :username";
		
		try {
			UserInfo userInfo = jdbcTemplate.queryForObject(query, getSqlParameterByModel(username), new UserInfoRowMapper());
			return userInfo;
		} catch (EmptyResultDataAccessException e) {
			
			return null;
		}
	}

	@Override
	public List<String> getUserRoles(String username) {
		
		String query = "select app_user_role from app_user_roles  where username = :username";
		
		try {
			List<String> roles = jdbcTemplate.queryForList(query, getSqlParameterByModel(username), String.class);

			return roles;
		} catch (EmptyResultDataAccessException e) {

			return null;
		}
	}

}
