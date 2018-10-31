package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Dept;

public interface DeptService {
	public List<Dept> findDeptList();
	
	public void updateState(String[] deptIds, int state);
	
	public void deleteDepts(String[] deptIds);
	
	public void saveDept(Dept dept);
	
	public Dept findDeptByID(String deptId);
}
