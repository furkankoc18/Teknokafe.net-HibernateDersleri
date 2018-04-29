package ders3SaveDeleteUpdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ders3SaveDeleteUpdate.Personel;

public class Yonetici 
{
	//SessionFactory factory=new Configuration().configure().buildSessionFactory();	//SessionFactory Nesnesi �retildi

	Configuration configuration=new Configuration();
	SessionFactory factory=configuration.configure("ders3SaveDeleteUpdate/hibernate.cfg.xml").buildSessionFactory();
	
	Session session=factory.openSession();											//Session Nesnesi �retildi
	Transaction transaction=session.getTransaction();								//Transaction Nesnesi �retildi

	public static void main(String[] args) 											//Main Method
	{	
		Yonetici yonetici=new Yonetici();	
		
			yonetici.kayit("Furkan","KOC",9250);									//Veritaban�na Kay�t Ekleniyor
			//yonetici.sil(1);														//Girilen id de�erindeki kay�t siliniyor
			//yonetici.guncelle(2, 8999);											// Girilen id de�erinde bulunan kay�d�n maa�� g�ncelleniyor
		
	}
	
	
	public void kayit(String isim,String soyisim,Integer maas)
	{
	
		Personel personel=new Personel(isim,soyisim,maas);
	
		try 
		{
			transaction.begin();
				session.save(personel);
			transaction.commit();
		}
		catch (Exception e) 
		{
			System.out.println("Verileri Kaydetmede Hata Var :"+e.toString());
			transaction.rollback();
		}
		finally
		{
		session.close();	
		}
		
	}
	public void sil(Integer id)
	{
				try
				{
					transaction.begin();
						session.delete(session.get(Personel.class, id));
					transaction.commit();
					
				}
				catch (Exception e) 
				{
					System.out.println("Verileri G�ncellemede Hata Var :"+e.toString());
					transaction.rollback();
				}
				finally 
				{
				session.close();	
				}
	}
	
	public void guncelle(Integer id,Integer maas)
	{
		Personel personel=new Personel();
	
		try 
		{
			personel=session.get(Personel.class, id);
			personel.setMaas(maas);
			
			transaction.begin();
				session.update(personel);
			transaction.commit();
		
		}
		catch (Exception e) 
		{
			System.out.println("Verileri G�ncellemede Hata Var :"+e.toString());
			transaction.rollback();
		}
		finally 
		{
			session.close();
		}
		
		
		
		
	}
	
}
