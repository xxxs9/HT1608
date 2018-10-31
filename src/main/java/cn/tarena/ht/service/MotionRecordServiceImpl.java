package cn.tarena.ht.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.MotionRecordMapper;
import cn.tarena.ht.pojo.MotionRecord;

@Service
public class MotionRecordServiceImpl implements MotionRecordService{
	
	@Autowired
	private MotionRecordMapper motionRecordMapper;

	public List<MotionRecord> findAllMotionRecordList() {
		return motionRecordMapper.findAllMotionRecordList();
	}

	public List<MotionRecord> findMotionRecordListByUserId(String userId) {
		return motionRecordMapper.findMotionRecordListByUserId(userId);
	}

	public void updateMotionRecord(MotionRecord motionRecord) {
		
		motionRecord.setUpdateTime(new Date());
		
		motionRecordMapper.updateMotionRecord(motionRecord);
		
	}

	public void saveMotionRecord(MotionRecord motionRecord) {
		
		motionRecord.setCreateTime(new Date());
		motionRecord.setCreateBy(motionRecord.getUser().getUserId());
		
		motionRecordMapper.saveMotionRecord(motionRecord);
	}

	public void deleteMotionRecords(int[] motionRecordIds) {
		motionRecordMapper.deleteMotionRecords(motionRecordIds);
	}

	
}
