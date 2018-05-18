package com.demo.test.swaggertest.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.swaggertest.Dao.UserDao;
import com.demo.test.swaggertest.domain.User;
import com.demo.test.swaggertest.service.UserService;

/**
 * @author gwl
 * @data 2018年5月11日
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(Long id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	@Override
	public int update(Long id, User user) {
		return userDao.update(id, user);
	}

	@Override
	public int delete(Long id) {
		return userDao.delete(id);
	}
}
