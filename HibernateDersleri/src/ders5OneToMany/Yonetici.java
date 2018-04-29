package ders5OneToMany;



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
		
		SessionFactory factory=configuration.configure("ders5OneToMany/hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=factory.openSession();											
		Transaction transaction=session.getTransaction();
		
		Personel personel=new Personel();
			personel.setIsim("Furkan");
			personel.setSoyisim("KOC");
			
		Adres adres=new Adres();
			adres.setApNo(55);
			adres.setCadde("Hizir Reis");
			adres.setMahalle("Evliya Celebi");
			adres.setSokak("Kavak Sokak");
		

			
		Adres adres2=new Adres();	
			adres2.setApNo(11);
			adres2.setCadde("Deneme Cadde");
			adres2.setMahalle("Bilinmeyen Mahalle");
			adres2.setSokak("Kavacik Sokagi");

		personel.getAdres().add(adres);
		personel.getAdres().add(adres2);
		//--------------------------------------------------------------------------------------------
		
		Personel personel2=new Personel();
			personel2.setIsim("Osman");
			personel2.setSoyisim("KORUCU");
		
		Adres adres3=new Adres();
			adres3.setApNo(81);
			adres3.setCadde("Organize Caddesi");
			adres3.setMahalle("Genc Mahalle");
			adres3.setSokak("Yurt Sokagi");
		
		
		Adres adres4=new Adres();
			adres4.setApNo(18);
			adres4.setCadde("Demirciler Caddesi");
			adres4.setMahalle("Hibernate Mahalle");
			adres4.setSokak("JPA Sokagi");
		
		personel2.getAdres().add(adres3);
		personel2.getAdres().add(adres4);
		//---------------------------------------------------------------------------------------------
		
		transaction.begin();
			session.save(personel);
			session.save(personel2);
		transaction.commit();

	}
	
}
