package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.MotionRecord;

public interface MotionRecordService {
	/**
	 * 查询全部运动记录
	 * @return
	 */
	public List<MotionRecord> findAllMotionRecordList();
	/**
	 * 查询个人运动记录
	 * @param userId
	 * @return
	 */
	public List<MotionRecord> findMotionRecordListByUserId(String userId);
	/**
	 * 更新运动记录
	 * @param motionRecord
	 */
	public void updateMotionRecord(MotionRecord motionRecord);

	public void saveMotionRecord(MotionRecord motionRecord);
	
	public void deleteMotionRecords(int[] motionRecordIds);
	
}
