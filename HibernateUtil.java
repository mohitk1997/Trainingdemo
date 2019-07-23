package com.mphasis.training.MavenProj;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.mphasis.training.beans.Booking;
import com.mphasis.training.beans.Movie;
import com.mphasis.training.beans.Theatre;
import com.mphasis.training.beans.Users;



public class HibernateUtil {
	public static SessionFactory getSessionFactor()
	{
		Configuration con=new Configuration();
		Properties props=new Properties();
		props.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
		   props.put(Environment.PASS,"notforsale");
		   props.put(Environment.USER,"mohit");
		   props.put(Environment.URL,"jdbc:oracle:thin:@localhost:1521:xe");
		   props.put(Environment.DIALECT,"org.hibernate.dialect.OracleDialect");
		   props.put(Environment.SHOW_SQL,"TRUE");
		   props.put(Environment.HBM2DDL_AUTO,"create");
		   con.setProperties(props);
		   con.addAnnotatedClass(Users.class);
		   con.addAnnotatedClass(Booking.class);
		   con.addAnnotatedClass(Movie.class);
		   con.addAnnotatedClass(Theatre.class);
		//   con.addAnnotatedClass(Department.class);
		   StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		   
		SessionFactory sessionfactory=con.buildSessionFactory(builder.build());
		return sessionfactory;
		
	}
}
