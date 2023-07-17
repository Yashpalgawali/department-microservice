package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Department;

@Repository("deptrepo")
public interface DepartmentRepo extends JpaRepository<Department, Long> {

	
	
}