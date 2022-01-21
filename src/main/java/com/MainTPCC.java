package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tpcc.*;
public class MainTPCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbInfo");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			EmployeeTPCC emp=new EmployeeTPCC();
			
			emp.setEmpName("Priya");
			emp.setEmpSalary(40000);
			
			PermanentEmpTPCC pe=new PermanentEmpTPCC();
			
			pe.setEmpName("Jitesh");
			pe.setEmpSalary(45000);
			pe.setWorkinghours(9);
			pe.setBonus(5000);
			
			ProbationEmpTPCC po=new ProbationEmpTPCC();
			
			po.setEmpName("Mukesh");
			po.setEmpSalary(50000);
			po.setContractDuration(4);
			
			et.begin();
			em.persist(emp);
			em.persist(pe);
			em.persist(po);
			et.commit();
			em.close();
			
			System.out.println("Done");
			
		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
	}

}
