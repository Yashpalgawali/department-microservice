package com.example.demo.service;

import java.util.List;

import com.example.demo.VO.ResponseTemplateVO;
import com.example.demo.models.Department;

public interface DepartmentService {

	
	public Department saveDepartment(Department dept);
	
	public List<Department> getAllDepartments();
	
	public Department getDeptByDeptId(Long did);

	public ResponseTemplateVO getDepartmentWithCompany(Long did);
	

}
