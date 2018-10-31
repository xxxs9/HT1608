package cn.tarena.ht.mapper;

import cn.tarena.ht.pojo.UserInfo;

public interface UserInfoMapper {
	
	public void updateUserInfo(UserInfo userInfo);
	
	public void deleteUserInfo(String[] userInfoIds);
	
	public void saveUserInfo(UserInfo userInfo);
}
