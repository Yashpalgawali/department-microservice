package com.example.demo.VO;

import java.util.List;

import com.example.demo.models.Department;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	
	private Department department;
	
	private Company company;
	
	
}
