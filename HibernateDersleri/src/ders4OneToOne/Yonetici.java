package ders4OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Yonetici 
{
									

	public static void main(String[] args) 											
	{	
	//	SessionFactory factory=new Configuration().configure().buildSessionFactory();	
		
		Configuration configuration=new Configuration();
		configuration.configure("ders4OneToOne/hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		
		
		Session session=factory.openSession();											
		Transaction transaction=session.getTransaction();
		
		Personel personel=new Personel("Furkan", "KOC");
		
		personel.getAdres().setApNo(18);
		personel.getAdres().setCadde("Hizir Reis");
		personel.getAdres().setMahalle("Cumali");
		personel.getAdres().setSokak("Bilinmez Sokak");
		
		
		Personel personel2=new Personel("Osman", "KORUCU");
		personel2.getAdres().setApNo(25);
		personel2.getAdres().setCadde("Kongre Caddesi");
		personel2.getAdres().setMahalle("Universite Caddesi");
		personel2.getAdres().setSokak("Deneme Sokagi");
		
		
		transaction.begin();
			session.save(personel);
			session.save(personel2);
		transaction.commit();
		
	}
	
}
