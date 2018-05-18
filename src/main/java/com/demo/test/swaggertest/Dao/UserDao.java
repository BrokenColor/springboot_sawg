package com.demo.test.swaggertest.Dao;

import java.util.List;

import com.demo.test.swaggertest.domain.User;

/**
 * @author gwl
 * @data 2018年5月14日
 */
public interface UserDao {
	User getUserById(Long id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Long id, User user);

	public int delete(Long id);
}
