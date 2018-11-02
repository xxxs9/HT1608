package cn.tarena.ht.pojo;

public class User extends BaseEntity{
	
	private String userId;
	private String username;		//用户昵称
	private String password;		//预留-账户密码
	private int state;				//1启用 2关闭
	private String openName;		//微信名
	private String openId;			//一对微信唯一标识
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenName() {
		return openName;
	}
	public void setOpenName(String openName) {
		this.openName = openName;
	}
	
}
