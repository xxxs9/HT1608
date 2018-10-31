package cn.tarena.ht.pojo;

import java.util.Date;

public class MotionRecord extends BaseEntity{

	private int motionRecordId;			//运动记录ID
	private User user;	//用户运动ID
	private Goal goal;					//运动目标——外键约束
	
	private Date startTime;				//开始时间
	private int completeNum;			//运动完成数
	private Date endTime;				//结束时间
	
	public int getMotionRecordId() {
		return motionRecordId;
	}
	public void setMotionRecordId(int motionRecordId) {
		this.motionRecordId = motionRecordId;
	}
	public Goal getGoal() {
		return goal;
	}
	public void setGoal(Goal goal) {
		this.goal = goal;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public int getCompleteNum() {
		return completeNum;
	}
	public void setCompleteNum(int completeNum) {
		this.completeNum = completeNum;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
