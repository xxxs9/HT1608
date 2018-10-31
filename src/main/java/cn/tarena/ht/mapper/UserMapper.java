package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.User;

public interface UserMapper {
	public List<User> findUserList();
	
	public User findUserByUserId(String userId);
	
	public User findUserByOpenId(String openId);
	
	public void updateUser(User user);

	public void deleteUsers(String[] userIds);

	public void saveUser(User user);
}
