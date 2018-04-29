package ders2Tanitim;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test 
{
	public static void main(String[] args) 
	{
	
	//	SessionFactory factory=new Configuration().configure().buildSessionFactory();		// SessionFactory Nesnesi Üretiliyor
		
		Configuration configuration=new Configuration();
		SessionFactory factory=configuration.configure("ders2Tanitim/hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();												//Session Nesnesi Üretiliyor
		Transaction transaction=session.getTransaction();									// Transaction Nesnesi Üretiliyor
		
		
		Personel personel=new Personel();													//Kalýcý Sýnýfýmýzdan Nesne Üretiliyor
														//Gerekli atamalar yapýlýyor
		personel.setPersonel_id(18);
		personel.setPersonel_isim("Furkan");
		personel.setPersonel_soyisim("KOC");
		personel.setPersonel_maas(4250);
		
		try 										
		{
			transaction.begin();							// Ýþlem baþlatýlýyor
			session.save(personel);							//personel nesnemiz kalýcý hale getiriliyor tablomuza ekleniyor
			transaction.commit();							// iþlem gerçekleþtiriliyor
		} 
		catch (Exception e)									
		{
			transaction.rollback();							// Eðer herhangi bir hata meydana gelirse iþlemler geri alýnýyor
			System.out.println("Hata Var :"+e.toString());	
		}
		finally 
		{
			session.close();								//Session nesnemizi kapatýyoruz
		}
		
		
		
		
		
	}
}
