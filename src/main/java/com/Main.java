package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbInfo");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Employee emp=new Employee();
			emp.setEmpName("Priya");
			emp.setEmpSalary(40000);
			
			PermanentEmp pe=new PermanentEmp();
			pe.setEmpName("Jitesh");
			pe.setEmpSalary(45000);
			pe.setWorkinghours(9);
			pe.setBonus(5000);
			
			ProbationEmp po=new ProbationEmp();
			po.setEmpName("Mukesh");
			po.setEmpSalary(50000);
			po.setContractDuration(4);
			
			et.begin();
			//em.persist(emp);
			//em.persist(pe);
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
