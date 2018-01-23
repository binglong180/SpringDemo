package com.spring.service;

import com.spring.bean.User;
import com.spring.dao.UserDao;

public class UserServiceImpl implements UserService {
	// 声明接口类型的引用，和具体实现类解耦合
	private UserDao userDao;
	
	// dao 属性的setter访问器，会被Spring调用，实现设值注入
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		userDao.save(user);
		
	}

	
	

}
