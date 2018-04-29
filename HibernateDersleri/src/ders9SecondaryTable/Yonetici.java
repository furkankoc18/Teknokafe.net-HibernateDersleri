package ders9SecondaryTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Yonetici 
{
	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration();
			configuration.configure("ders9SecondaryTable/hibernate.cfg.xml");
			
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
	
		//------------------------------------------------------------------
		
		Personel personel=new Personel("Abdullah Furkan", "KOC", 5396);
		
		//------------------------------------------------------------------
	
		transaction.begin();
			session.save(personel);
		transaction.commit();
		
		//------------------------------------------------------------------		
	}
}
