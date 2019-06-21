package com.springCurdMvc.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee789")
public class Employee {
	
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name="name")
	private String empName;
	@Column(name="address")
	private String empAddr;
	@Column(name="salary")
	private long empSal;
	@Column(name="age")
	private int empAge;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public long getEmpSal() {
		return empSal;
	}
	public void setEmpSal(long empSal) {
		this.empSal = empSal;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + ", empSal=" + empSal
				+ ", empAge=" + empAge + "]";
	}

	
}
