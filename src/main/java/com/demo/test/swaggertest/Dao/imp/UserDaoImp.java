package com.demo.test.swaggertest.Dao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.test.swaggertest.Dao.UserDao;
import com.demo.test.swaggertest.domain.User;

/**
 * @author gwl
 * @data 2018年5月14日
 */
@Repository
public class UserDaoImp implements UserDao{

//	@Autowired
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Override
	public User getUserById(Long id) {
		List<User> list = jdbcTemplate.query("select * from user where id = ?", 
				new Object[]{id}, new BeanPropertyRowMapper<User>(User.class));
		if(list!=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<User> getUserList() {
		List<User> list = jdbcTemplate.query("select * from user", 
				new Object[]{}, new BeanPropertyRowMapper<User>(User.class));
		if(list!=null && list.size()>0){
			return list;
		}else{
			return null;
		}
	}

	@Override
	public int add(User user) {
		return jdbcTemplate.update("insert into user(id,name, age) values(?, ?, ?)",user.getId(),
				user.getName(),user.getAge());

	}

	@Override
	public int update(Long id, User user) {
		return jdbcTemplate.update("UPDATE user SET name = ? , age = ? WHERE id=?",
				user.getName(),user.getAge(), id);
	}

	@Override
	public int delete(Long id) {
		return jdbcTemplate.update("DELETE from user where id = ? ",id);
	}

}
