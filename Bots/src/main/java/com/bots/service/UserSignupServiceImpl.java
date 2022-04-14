package com.bots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bots.beans.Users;
import com.bots.dao.UserSignupDao;

@Service
public class UserSignupServiceImpl
{
	@Autowired
	UserSignupDao userSignupDao;	
	
	public Users getUserId(String email) 
	{		
		return userSignupDao.findByEmail(email);
	}
	
	public void addUsers(Users u) 
	{
		 userSignupDao.save(u);
	}

	public Users getById(long id) 
	{
		return userSignupDao.getById(id);
	}
	 
	public String checkLogin(String email, String pass) 
	{
		return userSignupDao.checkLogin(email, pass);
	}
}