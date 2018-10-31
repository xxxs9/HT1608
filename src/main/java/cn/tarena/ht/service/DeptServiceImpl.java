package cn.tarena.ht.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.DeptMapper;
import cn.tarena.ht.pojo.Dept;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;

	public List<Dept> findDeptList() {
		return deptMapper.findDeptList();
	}

	public void updateState(String[] deptIds, int state) {
		deptMapper.updateState(deptIds, state);
	}

	public void deleteDepts(String[] deptIds) {
		deptMapper.deleteDepts(deptIds);
	}

	public void saveDept(Dept dept) {
		// 璁剧疆鐘舵�
		dept.setState(1);
		deptMapper.saveDept(dept);
	}

	public Dept findDeptByID(String deptId) {
		return deptMapper.findDeptByID(deptId);
	}

}
