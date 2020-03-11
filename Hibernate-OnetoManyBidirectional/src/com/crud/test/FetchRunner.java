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
  //  HusbandDto hl=session.get(HusbandDto.class, 1);
  //  WifeDto dl=session.get(WifeDto.class, 1);
   // System.out.println(hl);
   // System.out.println(dl);
    	//if(hl!=null&&dl!=null)
    	//{
    	//	session.delete(hl);
    	//	session.delete(dl);
    		///transaction.commit();
    		//session.close();
    	//	sessionfact.close();
    	//}
    	//else 
    	//{
    	//	System.out.println("Pk Doesnot Exist");
    	//}
	}
}
