package com.mphasis.training.MavenProj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.beans.Movie;
import com.mphasis.training.beans.Theatre;
import com.mphasis.training.beans.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Users u1=new Users();
    	u1.setPhno(7330855779L);
    	u1.setPassword("notforsale");
    	u1.setUsername("Mohit");
    	u1.setEmailid("mohitk95@gmail.com");
    	Theatre t1=new Theatre();
    	t1.setTheatreid(11);
    	t1.setTheatreName("INOX");
    	t1.setNoofseats(2);
    	Movie m1=new Movie();

    	
//		1.setEmpid(102);
//		e1.setEmpName("Komal");
//		e1.setSalary(66666);
//	Employee e1=null;
		Configuration con=new Configuration().configure().addAnnotatedClass(Users.class);
		SessionFactory sFactory=con.buildSessionFactory();
		Session session=sFactory.openSession();
		Transaction tr= session.beginTransaction();
		System.out.println(u1);
		session.save(u1);
		session.save(t1);
		session.save(m1);		
//		e1=(Employee) session.get(Employee.class, 102);		
//		e1.setEmpid(102);
//		e1.setEmpName("RAJNIKANTH BOI");
//		System.out.println(e1);	
//		e1=(Employee) session.get(Employee.class, 101);
//		System.out.println(e1);
//		System.out.println("LISTING : ");
//		List<Employee> employees=session.createCriteria(Employee.class).list();
//		employees.forEach((e)->System.out.println(e));
//	    session.delete(e1);
tr.commit();
session.close();
System.out.println("done");
    }
}

