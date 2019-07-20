package cn.li.service;

import java.util.List;

import cn.li.pojo.User;

public interface UserService {
	User fetch(int id);
	
	List<User> list();
}
