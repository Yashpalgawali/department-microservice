package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.VO.ResponseTemplateVO;
import com.example.demo.models.Department;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService deptserv;
	
	@PostMapping("/")
	public String saveDepartment(@RequestBody Department depart)
	{
		Department dept = deptserv.saveDepartment(depart);
		if(dept!=null)
		{
			return "redirect:/";
		}
		else {
			return "redirect:/";
		}
	}
	

//	@GetMapping("/")@ResponseBody
//	public List<Department> viewDepartments()
//	{
//		return deptserv.getAllDepartments();
//	}
	

	
	@GetMapping("/{id}")@ResponseBody
	public ResponseTemplateVO getDepartmentWithCompany(@PathVariable("id")Long id)
	{
		return deptserv.getDepartmentWithCompany(id);
	}
}
