package com.sunzelong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunzelong.bean.User;
import com.sunzelong.common.ConstantClass;
import com.sunzelong.mapper.UserMapper;
import com.sunzelong.service.UserService;

/**
 * 
 * @author zhuzg
 *
 */
@Service
//@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public PageInfo<User> getPageList(String name, Integer page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,ConstantClass.PAGE_SIZE);
		return new PageInfo<User>(userMapper.list(name));
	}

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.getById(userId);
	}

	@Override
	public int updateStatus(Integer userId, int status) {
		// TODO Auto-generated method stub
		return userMapper.updateStatus(userId,status);
	}

}
