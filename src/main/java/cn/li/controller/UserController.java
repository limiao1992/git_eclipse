package cn.li.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.li.pojo.User;
import cn.li.service.UserService;

@RestController
@RequestMapping("u")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("user/{id}")
	public User getUser(@PathVariable Integer id) {
		User user=userService.fetch(id);
		return user;	
	}
	
	@RequestMapping("userList")
	public List<User> getUser() {
		List<User> user=userService.list();
		return user;	
	}
	
}
