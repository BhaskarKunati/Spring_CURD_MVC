package com.springCurdMvc.dao;

import java.util.List;

import com.springCurdMvc.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee emp);
	public List<Employee> getAllEmp();
	public void deleteEmp(Employee emp);

}
