package ders11_HQL1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Yonetici
{
	public static void main(String[] args) 
	{
		
		Configuration configuration=new Configuration();
			configuration.configure("ders11_HQL1/hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
		
		transaction.begin();
			for(int i=1;i<=5;i++)
			{
				Personel personel=new Personel("Furkan-"+i, "KOC-"+i, 5000+i);
				session.save(personel);
			}
		transaction.commit();
		
		Query query=session.createQuery("From Personel");
		List<Personel>personelListesi=query.getResultList();
		
		for(Iterator iterator=personelListesi.iterator();iterator.hasNext();)
		{
			Personel personel=(Personel) iterator.next();
			System.out.println("Id :"+personel.getId());
			System.out.println("Ýsim :"+personel.getIsim());
			System.out.println("Soyisim :"+personel.getSoyisim());
			System.out.println("Maaþ :"+personel.getMaas());
			System.out.println("--------------------------------------------------------------------");
		}
	}
}
