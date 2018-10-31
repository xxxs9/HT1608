package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.Goal;

public interface GoalMapper {
	
	public List<Goal> findAllGoalList();
	
	public Goal findGoalByGoalId(int goalId);
	
	public void updateGoal(int goalId);
	
	public void deleteGoals(int[] goalIds);

	public void saveGoal(Goal goal);
}
