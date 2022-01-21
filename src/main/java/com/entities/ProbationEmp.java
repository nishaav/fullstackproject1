package com.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Probation")
public class ProbationEmp extends Employee
{
	@Column
	private int ContractDuration;

	public int getContractDuration() {
		return ContractDuration;
	}

	public void setContractDuration(int contractDuration) {
		ContractDuration = contractDuration;
	}
	
}
