package com.tpsc;
import javax.persistence.*;
@Entity
//@Table(name="") : name to the table
@Table
@PrimaryKeyJoinColumn(name="EmpId")
public class PermanentEmpTPS extends EmployeeTPS {

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
