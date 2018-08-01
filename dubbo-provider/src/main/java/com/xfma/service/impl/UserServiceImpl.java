package com.xfma.service.impl;

import com.xfma.bean.User;
import com.xfma.service.IUserService;

public class UserServiceImpl implements IUserService {

	public User getUserById(Integer id) {
		
		return new User(id, "aa");
	}

}
