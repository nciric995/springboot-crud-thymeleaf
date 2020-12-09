package com.springboot.crud.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findAllByOrderByPrezimeAsc();
}
