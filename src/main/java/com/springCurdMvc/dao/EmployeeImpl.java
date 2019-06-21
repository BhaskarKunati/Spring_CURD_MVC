package com.springCurdMvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springCurdMvc.model.Employee;
@Repository
public class EmployeeImpl implements EmployeeDao 
{
	@Autowired
	private HibernateTemplate ht;

	@Override
	public void addEmployee(Employee emp) {
		
		ht.saveOrUpdate(emp);
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> listEmp=ht.loadAll(Employee.class);
		return listEmp;
	}

	@Override
	public void deleteEmp(Employee emp) {
		ht.delete(emp);
	}

}
