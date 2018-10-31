package cn.tarena.ht.pojo;

public class UserMotion extends BaseEntity{

	private String userMotionId;	//用户运动ID

	private String averageStep;		//日均步数
	private int motionNum;			//运动次数
	private String averageJump;		//日均跳跃
	private String practice;		//平衡练习时长
	private String stepStatus;		//步态状态
	
	public String getUserMotionId() {
		return userMotionId;
	}
	public void setUserMotionId(String userMotionId) {
		this.userMotionId = userMotionId;
	}
	public String getAverageStep() {
		return averageStep;
	}
	public void setAverageStep(String averageStep) {
		this.averageStep = averageStep;
	}
	public int getMotionNum() {
		return motionNum;
	}
	public void setMotionNum(int motionNum) {
		this.motionNum = motionNum;
	}
	public String getAverageJump() {
		return averageJump;
	}
	public void setAverageJump(String averageJump) {
		this.averageJump = averageJump;
	}
	public String getPractice() {
		return practice;
	}
	public void setPractice(String practice) {
		this.practice = practice;
	}
	public String getStepStatus() {
		return stepStatus;
	}
	public void setStepStatus(String stepStatus) {
		this.stepStatus = stepStatus;
	}
	
}
