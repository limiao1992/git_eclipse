package cn.li.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.li.pojo.User;


public interface UserDao {
	User fetch(@Param("id") int id);
	
	List<User> list();
}
