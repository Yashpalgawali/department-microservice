package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.Company;
import com.example.demo.VO.ResponseTemplateVO;
import com.example.demo.models.Department;
import com.example.demo.repository.DepartmentRepo;



@Service("deptserv")
public class DepartmentServimpl implements DepartmentService {

	@Autowired
	DepartmentRepo deptrepo;
	
	@Override
	public Department saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		return deptrepo.save(dept);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return deptrepo.findAll();
	}

	@Override
	public Department getDeptByDeptId(Long did) {
		// TODO Auto-generated method stub
		return deptrepo.findById(did).get();
	}

	@Autowired
	RestTemplate template;
	
	@Override
	public ResponseTemplateVO getDepartmentWithCompany(Long did) {
		// TODO Auto-generated method stub
		System.err.println("Inside getDepartmentWithCompany() dept_id= "+did);
		ResponseTemplateVO vo = new ResponseTemplateVO();
		
		Department dept = deptrepo.findById(did).get();
		
		Company comp = template.getForObject("http://COMPANY-SERVICE/company/"+dept.getComp_id(), Company.class); 
		
		//System.err.println(""+comp.toString());
		
		vo.setCompany(comp);
		vo.setDepartment(dept);
		return vo;
	}


	
}
