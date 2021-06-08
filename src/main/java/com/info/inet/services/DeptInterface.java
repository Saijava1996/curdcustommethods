package com.info.inet.services;

import java.util.List;

import com.info.inet.entity.Department;

public interface DeptInterface {
	public Department save(Department department );
	
	public List<Department> getAllDepts();

	public List<Department> findByDname(String dname);
	
	public List<Department> findByDnameAndDrole(String dname,String drole);

}
