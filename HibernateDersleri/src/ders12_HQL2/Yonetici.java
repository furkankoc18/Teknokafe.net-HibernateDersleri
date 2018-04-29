package ders12_HQL2;

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
			configuration.configure("ders12_HQL2/hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
				
		transaction.begin();
			for(int i=1;i<=5;i++)
			{
				Personel personel=new Personel("Furkan-"+i, "KOC-"+i, 1000+i);
				session.save(personel);
			}
		transaction.commit();
	
		Query  query=session.createNamedQuery("butunVerileriCek", Personel.class);		
			List<Personel>personelListesi=query.getResultList();

		for(Personel personel:personelListesi)
		{
			System.out.println("Ýd => "+personel.getId());
			System.out.println("Ýsim => "+personel.getIsim());
			System.out.println("Soyisim => "+personel.getSoyisim());
			System.out.println("Maaþ => "+personel.getMaas());
			System.out.println("---------------------------------------------");
		}	
	
		query=session.getNamedQuery("personelCek_id");
		query.setParameter("no", 3);
	
	
		Personel personel= (Personel) query.getResultList().get(0);
		System.out.println("---12-----------");
		System.out.println("Ýd => "+personel.getId());
		System.out.println("Ýsim => "+personel.getIsim());
		System.out.println("Soyisim => "+personel.getSoyisim());
		System.out.println("Maaþ => "+personel.getMaas());
		System.err.println("------------Normal SQL KOD------------");
	
		query=session.createNamedQuery("normalSQLTum");
		List<Personel>personelListesi2=query.getResultList();
	
		for(Personel personel2:personelListesi2)
		{
			System.out.println("Ýd => "+personel2.getId());
			System.out.println("Ýsim => "+personel2.getIsim());
			System.out.println("Soyisim => "+personel2.getSoyisim());
			System.out.println("Maaþ => "+personel2.getMaas());
			System.out.println("---------------------------------------------");
		}	
	}
}
