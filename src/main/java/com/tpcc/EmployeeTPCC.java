package com.tpcc;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class EmployeeTPCC 
{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int EmpId;
	@Column
	private String EmpName;
	@Column
	private int EmpSalary;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
}
