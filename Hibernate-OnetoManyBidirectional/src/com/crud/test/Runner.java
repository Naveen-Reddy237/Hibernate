package com.crud.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner
{
public static void main(String[] args) 
{

	SessionFactory sf1= HibernateUtil.buildSessionFactory();
	FatherDto fd=new FatherDto();
	fd.setName("RamDayal");
	fd.setSalary(80000);

	
	SonDto sd= new SonDto();
	sd.setName("karan");
	sd.setStream("eee");
	
	SonDto sd1= new SonDto();
	sd1.setName("charan");
	sd1.setStream("ece");
	 
	
	// List<SonDto> sons=Arrays.asList(sd,sd1);
	// sons.add(sd);
	// sons.add(sd1);
	
	
	List<SonDto> sons=new ArrayList<SonDto>();
	sons.add(sd);
	sons.add(sd1);
	
	// relationship 
	fd.setSons(sons);
	sd.setFather(fd);
	sd1.setFather(fd);
	
	Session session=sf1.openSession();
	Transaction tx=session.beginTransaction();
	session.save(fd);
	session.save(sd);
	session.save(sd1);
	tx.commit();
	session.close();
	sf1.close();
	
	
	
}

}
