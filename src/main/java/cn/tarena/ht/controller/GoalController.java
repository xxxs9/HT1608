package cn.tarena.ht.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tarena.ht.pojo.Goal;
import cn.tarena.ht.pojo.User;
import cn.tarena.ht.service.GoalService;
import cn.tarena.ht.utils.ServletResult;

@Controller
@RequestMapping("/motion/goal/")
public class GoalController {

	@Autowired
	private GoalService goalService;
	
	private ServletResult result = new ServletResult();
	
	@RequestMapping("goalList")
	public void goalList(HttpServletRequest request,HttpServletResponse response){//Goal goal
		result.setReturnObject(null);
		result.setCode(403);
		
		try {
			result = goalService.findGoalList(result);
			response.getWriter().print(JSONObject.fromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	@RequestMapping("cs")
	public void saveGoal(HttpServletRequest request,HttpServletResponse response){//Goal goal
		
		Goal goal = new Goal();
		goal.setGoalName("跑步");
		goal.setGoalNum("10000");
		goal.setGoalType("跑步步数");
		goalService.saveGoal(goal);
		try {
			response.getWriter().print("12314");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	@RequestMapping("csList")
	public void findGoalList(HttpServletRequest request){//Goal goal
		
//		List<Goal> goalList= goalService.findGoalList();
		int goalId = 1;
		Goal goal = goalService.findGoalByGoalId(goalId);
		System.out.println(goal.getGoalNum());
	}
	
}
