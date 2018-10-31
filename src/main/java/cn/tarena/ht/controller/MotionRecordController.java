package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tarena.ht.pojo.MotionRecord;
import cn.tarena.ht.service.GoalService;
import cn.tarena.ht.service.MotionRecordService;
import cn.tarena.ht.service.UserService;

@Controller
@RequestMapping("/motion/motionRecord/")
public class MotionRecordController {

	@Autowired
	private MotionRecordService motionRecordService;
	@Autowired
	private GoalService goalService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("cs")
	public void createMotionRecord(){//MotionRecord motionRecord
		
		MotionRecord motionRecord = new MotionRecord();
		motionRecord.setGoal(goalService.findGoalByGoalId(1));
		motionRecord.setUser(userService.findUserByUserId("7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f"));
		
		motionRecordService.saveMotionRecord(motionRecord);
	}
	
	@RequestMapping("csList")
	public void findMotionRecordListByUserId(){//MotionRecord motionRecord
		
		List<MotionRecord> mrList = motionRecordService.findMotionRecordListByUserId("7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f");
 	}
	
}
