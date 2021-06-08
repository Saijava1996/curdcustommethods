package com.info.inet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.inet.entity.Department;
import com.info.inet.repository.DeptRepository;
@Service
public class DepartmentImp implements DeptInterface {
	@Autowired
	private DeptRepository deptRepository;

	@Override
	public Department save(Department department) {
		
		return deptRepository.save(department);
	}

	public List<Department> getAllDepts() {
		// TODO Auto-generated method stub
		return deptRepository.findAll();
	}

	@Override
	public List<Department> findByDname(String dname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findByDnameAndDrole(String dname, String drole) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Department> findByDnameOrDrole(String dname, String drole) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
