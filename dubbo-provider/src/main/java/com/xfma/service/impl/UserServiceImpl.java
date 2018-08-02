package com.xfma.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xfma.bean.User;
import com.xfma.service.IUserService;

//使用dubbo的service注解，不使用spring的service注解
@Service
public class UserServiceImpl implements IUserService {

	public User getUserById(Integer id) {
		
		return new User(id, "aa");
	}

}
