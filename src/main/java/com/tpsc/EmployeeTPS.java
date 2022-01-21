package com.tpsc;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
public class EmployeeTPS {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
