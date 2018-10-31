package cn.tarena.ht.service;

import cn.tarena.ht.pojo.Goal;
import cn.tarena.ht.utils.ServletResult;

public interface GoalService {

	public Goal findGoalByGoalId(int goalId);
	
	public ServletResult findGoalList(ServletResult result);
	
	public void updateGoal(int goalId);
	
	public void saveGoal(Goal goal);
	
	public void deleteGoals(int[] goalIds);
	
}
