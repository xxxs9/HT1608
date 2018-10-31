package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.MotionRecord;

public interface MotionRecordMapper {
	
	public List<MotionRecord> findAllMotionRecordList();
	/**
	 * 查看个人运动记录
	 * @param userId
	 * @return
	 */
	public List<MotionRecord> findMotionRecordListByUserId(String userId);
	/**
	 * 更新运动记录
	 * @param motionRecord
	 */
	public void updateMotionRecord(MotionRecord motionRecord);
	
	public void deleteMotionRecords(int[] motionRecordIds);

	public void saveMotionRecord(MotionRecord motionRecord);
}
