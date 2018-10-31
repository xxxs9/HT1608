package cn.tarena.ht.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.UserInfoMapper;
import cn.tarena.ht.mapper.UserMapper;
import cn.tarena.ht.mapper.UserMotionMapper;
import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;
import cn.tarena.ht.pojo.UserMotion;
import cn.tarena.ht.utils.ServletResult;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private UserMotionMapper userMotionMapper;
	
	public ServletResult register(User user,ServletResult result){
		
		User userDTO = new User();
		userDTO = userMapper.findUserByOpenId(user.getOpenId());
				
		if (userDTO == null) {
			userDTO = save(user);
			result.setCode(200);
			result.setReturnObject(userDTO);
			result.setContent("found new user");
		}else if (userDTO != null){
			result.setCode(200);
			result.setReturnObject(userDTO);
			result.setContent("existence user");
		}
		return result;
	}
	
	public ServletResult updateUser(User user,ServletResult result){
		
		User userDTO = new User();
//		User beforeUser = new User();
		
		if (userMapper.findUserByUserId(user.getUserId()) != null) {
//			beforeUser = userMapper.findUserByUserId(user.getUserId());
			userDTO = update(user);
			if (userDTO != null) {
				result.setCode(200);
				result.setReturnObject(userDTO);
				result.setContent("update user");
			}
		}else{
			result.setContent("not find user");
		}
		return result;
	}
	
	
	//----------------------------------------------------------------------
	
	
	public List<User> findUserList() {
		return userMapper.findUserList();
	}
	
	public User findUserByUserId(String userId){
		return userMapper.findUserByUserId(userId);
	}

	public void deleteUsers(String[] userIds) {
		userMapper.deleteUsers(userIds);
		userInfoMapper.deleteUserInfo(userIds);
		userMotionMapper.deleteUserMotion(userIds);
	}

	public void saveUser(User user) {
		String uuid = UUID.randomUUID().toString();
		// 获取userInfo中的数据
		UserInfo userInfo = user.getUserInfo();
		UserMotion userMotion = user.getUserMotion();
		
		user.setUserId(uuid);
		user.setState(1);
		user.setCreateTime(new Date());

		userInfo.setUserInfoId(uuid);
		userInfo.setCreateTime(new Date());
		
		userMotion.setUserMotionId(uuid);
		userMotion.setCreateTime(new Date());
		
		userInfoMapper.saveUserInfo(userInfo);
		userMotionMapper.saveUserMotion(userMotion);
		userMapper.saveUser(user);
		
	}
	/**
	 * 注册微信用户
	 * @param user
	 * @return
	 */
	private User save(User user){
		
		String uuid = UUID.randomUUID().toString();
		// 获取userInfo中的数据
		UserInfo userInfo = user.getUserInfo();
		UserMotion userMotion = user.getUserMotion();
		
		user.setUserId(uuid);
		user.setState(1);
		user.setCreateTime(new Date());

		userInfo.setUserInfoId(uuid);
		userInfo.setCreateTime(new Date());
		
		userMotion.setUserMotionId(uuid);
		userMotion.setCreateTime(new Date());
		
		userInfoMapper.saveUserInfo(userInfo);
		userMotionMapper.saveUserMotion(userMotion);
		userMapper.saveUser(user);
		
		return user;
	}
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	private User update(User user){
		
		UserInfo userInfo = user.getUserInfo();
		UserMotion userMotion = user.getUserMotion();
		
		user.setUpdateTime(new Date());
		user.setUpdateBy(user.getUserId());
		userMapper.updateUser(user);
		
		userInfo.setUpdateTime(new Date());
		userInfo.setUpdateBy(user.getUserId());
		userInfoMapper.updateUserInfo(userInfo);
		
		userMotion.setUpdateTime(new Date());
		userMotion.setUpdateBy(user.getUserId());
		userMotionMapper.updateUserMotion(userMotion);
		
		return user;
	}
	
}
