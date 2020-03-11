package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FetchRunner 
{
public static void main(String[] args)
{
	SessionFactory sessionfact=HibernateUtil.buildSessionFactory();
	Session session=sessionfact.openSession();
FatherDto pm=session.get(FatherDto.class, 1);
    System.out.println(pm);
	SonDto co=session.get(SonDto.class,1);
	System.out.println(co);
	Transaction transaction=session.beginTransaction();
	
	// for delete 
    FatherDto pm=session.get(FatherDto.class, 1);
 SonDto co=session.get(SonDto.class,1);
   
    	if(pm!=null&&co!=null)
    	{
    		session.delete(pm);
    		session.delete(co);
    		transaction.commit();
    		session.close();
    		sessionfact.close();
    	}
    	else 
    	{
    		System.out.println("Pk Doesnot Exist");
    	}
	}
}
