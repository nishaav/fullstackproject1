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
public class PermanentEmpTPCC extends EmployeeTPCC{

	@Column
	private int bonus;
	
	@Column
	private int workinghours;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getWorkinghours() {
		return workinghours;
	}

	public void setWorkinghours(int workinghours) {
		this.workinghours = workinghours;
	}
	
}
