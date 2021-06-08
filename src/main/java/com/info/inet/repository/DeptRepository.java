package com.info.inet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.inet.entity.Department;

public interface DeptRepository extends JpaRepository<Department,Integer > {
	

	public List<Department> findByDname(String dname);
	
	public List<Department> findByDnameAndDrole(String dname, String drole);

	public List<Department> findByDnameOrDrole(String dname, String drole);

}
