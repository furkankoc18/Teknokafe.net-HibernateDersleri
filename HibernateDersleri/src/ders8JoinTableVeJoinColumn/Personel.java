package ders8JoinTableVeJoinColumn;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity																
@Table(name="Personel")										
public class Personel implements Serializable	
{

	
	private static final long serialVersionUID = 1L;
	private Integer id;												
	private String isim;											
	private String soyisim;											
	
	private Adres adres=new Adres();
	
	

	public Personel() {												
	}

	public Personel(String isim, String soyisim) 		
	{
		this.isim = isim;
		this.soyisim = soyisim;
	}
	
	@Id																
	@GeneratedValue(strategy=GenerationType.AUTO)					
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="Personel_Adresleri",					//Tablo Olu�turarak �d De�erlerini Kullanarak Yeni Bir Tablo Olu�turuyor
		joinColumns=@JoinColumn(name="Personel_Id"), 		// Hakim Olan S�n�f�n �li�ki Kurdu�u Kayd�n Kolon Bilgisi
		inverseJoinColumns=@JoinColumn(name="Adres_Id")		//Hakim Olmayan S�n�f�n �li�ki Kurdu�u Kayd�n Kolon Bilgisi
			)
	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	

	
	
	
	
	
	
	
}
