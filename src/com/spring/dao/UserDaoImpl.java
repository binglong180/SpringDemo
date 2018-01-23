package com.spring.dao;

import com.spring.bean.User;

public class UserDaoImpl implements UserDao {
	
	@Override
	public void save(User user) {
		System.out.println("保存用户信息到数据库1111111");
	}

}
