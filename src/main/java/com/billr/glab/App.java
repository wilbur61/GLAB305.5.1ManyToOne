package com.billr.glab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new     Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	  //creating departments
    	Department dep = new Department();
    	dep.setDname("IT");
    	
    	Department dep2= new Department();
    	dep2.setDname("HR");
    	
      //creating teacher
    	Teacher t1 = new Teacher();
    	t1.setDep(dep);
    	t1.setSalary("1000");
    	t1.setTeachername("MHaseeb");
    	Teacher t2 = new Teacher();
    	t2.setDep(dep);
    	t2.setSalary("2220");
    	t2.setTeachername("Shahparan");
    	
    	Teacher t3 = new Teacher();
    	t3.setDep(dep);
    	t3.setSalary("30000");
    	t3.setTeachername("James");
    	
    	Teacher t4 = new Teacher();
    	t4.setDep(dep2);
    	t4.setSalary("40000");
    	t4.setTeachername("Joseph");
    	  //Storing Departments in database
    	session.persist(dep);
    	session.persist(dep2);
 	  //Storing teachers  in database
    	session.persist(t1);
    	session.persist(t2);
    	session.persist(t3);
    	session.persist(t4);
    	t.commit();	}
}


