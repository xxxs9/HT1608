package cn.tarena.ht.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.GoalMapper;
import cn.tarena.ht.pojo.Goal;
import cn.tarena.ht.utils.ServletResult;

@Service
public class GoalServiceImpl implements GoalService{

	@Autowired
	private GoalMapper goalMapper;
	
	public Goal findGoalByGoalId(int goalId){
		return goalMapper.findGoalByGoalId(goalId);
	}
	
	public ServletResult findGoalList(ServletResult result){
		
		List<Goal> goalList = goalMapper.findAllGoalList();
		if (goalList != null && goalList.size() > 0){
			result.setReturnObject(goalList);
			result.setCode(200);
			result.setContent("success");
		}else{
			result.setContent("error");
		}
		return result;
	}
	
	public void updateGoal(int goalId){
		goalMapper.updateGoal(goalId);
	}
	
	public void saveGoal(Goal goal){
		
		goal.setCreateTime(new Date());
		goal.setCreateBy("admin");
		
		goalMapper.saveGoal(goal);
	}
	
	public void deleteGoals(int[] goalIds){
		goalMapper.deleteGoals(goalIds);
	}
}
