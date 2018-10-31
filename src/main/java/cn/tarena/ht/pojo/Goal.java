package cn.tarena.ht.pojo;


public class Goal extends BaseEntity{

	private int goalId;		//目标ID
	private String goalType;	//目标类型
	private String goalName;	//目标名称
	private String goalNum;		//目标数
	
	public int getGoalId() {
		return goalId;
	}
	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}
	public String getGoalType() {
		return goalType;
	}
	public void setGoalType(String goalType) {
		this.goalType = goalType;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public String getGoalNum() {
		return goalNum;
	}
	public void setGoalNum(String goalNum) {
		this.goalNum = goalNum;
	}
	
}
