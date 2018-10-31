package cn.tarena.ht.mapper;

import cn.tarena.ht.pojo.UserMotion;

public interface UserMotionMapper {
	
	public void updateUserMotion(UserMotion userMotion);
	
	public void deleteUserMotion(String[] userIds);
	
	public void saveUserMotion(UserMotion userMotion);
	
}
