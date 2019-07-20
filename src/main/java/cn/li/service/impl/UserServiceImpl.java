package cn.li.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.li.dao.UserDao;
import cn.li.pojo.User;
import cn.li.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public User fetch(int id) {
		User user=userDao.fetch(id);
		return user;
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		List<User> userList=userDao.list();
		return userList;
	}

}
