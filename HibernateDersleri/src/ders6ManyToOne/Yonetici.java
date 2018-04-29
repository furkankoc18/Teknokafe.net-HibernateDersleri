package ders6ManyToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Yonetici 
{
	/**
	 * 
	 * @Furkan KOÇ
	 */
	public static void main(String[] args) 											
	{	
		//SessionFactory 	factory=new Configuration().configure().buildSessionFactory();	
		
		Configuration configuration=new Configuration();
		SessionFactory factory=configuration.configure("ders6ManyToOne/hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=factory.openSession();											
		Transaction transaction=session.getTransaction();
		
		
		Personel personel=new Personel();
			personel.setIsim("Furkan");
			personel.setSoyisim("KOC");
		//---------------------------------------------------------------------------------------------

			Adres adres=new Adres("ssdsd", "Deneme sddds", "sdssdds Sokak", 18,personel);
			Adres adres2=new Adres("Akcakoca Caddesi", "Beyciler Mahallesi", "Osman Sokak", 55, personel);
		//---------------------------------------------------------------------------------------------
		
		transaction.begin();
			session.save(adres);
			session.save(adres2);
		transaction.commit();

	}
	
}
