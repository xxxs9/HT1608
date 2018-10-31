package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.utils.ServletResult;

public interface UserService {// throws Exception
	
	public ServletResult register(User user,ServletResult result);
	
	public ServletResult updateUser(User user,ServletResult result);
	
	public List<User> findUserList();
	
	public User findUserByUserId(String userId);

	public void deleteUsers(String[] userIds);

	public void saveUser(User user); 
}
