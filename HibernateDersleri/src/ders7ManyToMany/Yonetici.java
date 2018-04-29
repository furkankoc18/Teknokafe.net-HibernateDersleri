package ders7ManyToMany;

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
		SessionFactory factory=configuration.configure("ders7ManyToMany/hibernate.cfg.xml").buildSessionFactory();
			Session session=factory.openSession();											
		Transaction transaction=session.getTransaction();
	//---------------------------------------------------------------------------------------------
		
		Adres adres=new Adres();
			adres.setApNo(25);
			adres.setCadde("Hizir Reis Caddesi");
			adres.setMahalle("Evliya Celebi Mahallesi");
			adres.setSokak("Kavak Sokak");
		Adres adres2=new Adres();
			adres2.setApNo(81);
			adres2.setCadde("Cedidiye Caddesi");
			adres2.setMahalle("Korkusuz Mahallesi");
			adres2.setSokak("Ecehan Sokak");
	//---------------------------------------------------------------------------------------------
			
		Personel personel=new Personel();
			personel.setIsim("Furkan");
			personel.setSoyisim("KOC");
			personel.getAdres().add(adres);
			personel.getAdres().add(adres2);
		Personel personel2=new Personel();
			personel2.setIsim("Osman");
			personel2.setSoyisim("Korucu");
			personel2.getAdres().add(adres);
			personel2.getAdres().add(adres2);
			
		
	//---------------------------------------------------------------------------------------------


	//---------------------------------------------------------------------------------------------
		
		transaction.begin();
			session.save(personel);
			session.save(personel2);
		transaction.commit();

	}
	
}
