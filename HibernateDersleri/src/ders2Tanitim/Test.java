package ders2Tanitim;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test 
{
	public static void main(String[] args) 
	{
	
	//	SessionFactory factory=new Configuration().configure().buildSessionFactory();		// SessionFactory Nesnesi �retiliyor
		
		Configuration configuration=new Configuration();
		SessionFactory factory=configuration.configure("ders2Tanitim/hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();												//Session Nesnesi �retiliyor
		Transaction transaction=session.getTransaction();									// Transaction Nesnesi �retiliyor
		
		
		Personel personel=new Personel();													//Kal�c� S�n�f�m�zdan Nesne �retiliyor
														//Gerekli atamalar yap�l�yor
		personel.setPersonel_id(18);
		personel.setPersonel_isim("Furkan");
		personel.setPersonel_soyisim("KOC");
		personel.setPersonel_maas(4250);
		
		try 										
		{
			transaction.begin();							// ��lem ba�lat�l�yor
			session.save(personel);							//personel nesnemiz kal�c� hale getiriliyor tablomuza ekleniyor
			transaction.commit();							// i�lem ger�ekle�tiriliyor
		} 
		catch (Exception e)									
		{
			transaction.rollback();							// E�er herhangi bir hata meydana gelirse i�lemler geri al�n�yor
			System.out.println("Hata Var :"+e.toString());	
		}
		finally 
		{
			session.close();								//Session nesnemizi kapat�yoruz
		}
		
		
		
		
		
	}
}
