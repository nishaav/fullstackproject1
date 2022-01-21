package com.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Permanent")
public class PermanentEmp extends Employee
{
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
