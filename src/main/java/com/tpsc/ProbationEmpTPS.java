package com.tpsc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name="") : name to the table
@Table
@PrimaryKeyJoinColumn(name="EmpId")

public class ProbationEmpTPS extends EmployeeTPS {
	@Column
	private int ContractDuration;

	public int getContractDuration() {
		return ContractDuration;
	}

	public void setContractDuration(int contractDuration) {
		ContractDuration = contractDuration;
	}
	
}
