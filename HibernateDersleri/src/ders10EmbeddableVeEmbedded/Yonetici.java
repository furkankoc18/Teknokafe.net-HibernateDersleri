package ders10EmbeddableVeEmbedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Yonetici 
{
	public static void main(String[] args) 
	{
		
		Configuration configuration=new Configuration();
			configuration.configure("ders10EmbeddableVeEmbedded/hibernate.cfg.xml");
			
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
		
		//----------------------------------------------------------------------------------
		
		Personel personel=new Personel("Alperen Emir", "KOC", 5350);
		Adres adres=new Adres("Deneme Mahallesi", "Uzunlar Caddesi", "Bilinmez Sokak", 18);
			personel.setAdres(adres);
			
		//-----------------------------------------------------------------------------------
		
		transaction.begin();
			session.save(personel);
		transaction.commit();
		
		//-------------------------------------------------------------------------------------		
		
	}
}
