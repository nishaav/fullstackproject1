package com.tpcc;

import javax.persistence.*;


@Entity
@Table
@AttributeOverrides(
		{
			@AttributeOverride(name="EmpId",column=@Column(name="EmpId")),
			@AttributeOverride(name="EmpName",column=@Column(name="EmpName")),
			@AttributeOverride(name="EmpSalary",column=@Column(name="EmpSalary"))
		}
		)
public class ProbationEmpTPCC extends EmployeeTPCC{

	@Column
	private int ContractDuration;

	public int getContractDuration() {
		return ContractDuration;
	}

	public void setContractDuration(int contractDuration) {
		ContractDuration = contractDuration;
	}
	
}
