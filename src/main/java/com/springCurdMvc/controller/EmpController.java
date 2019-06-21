package com.springCurdMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springCurdMvc.dao.EmployeeDao;
import com.springCurdMvc.model.Employee;

@Controller
public class EmpController {
@Autowired
private EmployeeDao dao;
@RequestMapping(value="/addemp", method=RequestMethod.GET)
public String getRecord(Model model)
{
	
		/*
		 * Employee emp=new Employee(); model.addAttribute("empdata", emp);
		 */
	return "addemp";
	
}

@RequestMapping(value="/addemp", method=RequestMethod.POST)
public String insertRecord(/*@RequestParam("empid")int empId,
		@RequestParam("empname")String empName,@RequestParam("empaddr")String empAddr,
		@RequestParam("empage")int empAge,@RequestParam("empsal")long empSal*/@ModelAttribute("empdata") Employee emp, Model m)
{
     dao.addEmployee(emp);
	m.addAttribute("empData", emp);
	return "saveData";
	
}
}
