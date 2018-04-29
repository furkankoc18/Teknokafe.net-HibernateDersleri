package ders3SaveDeleteUpdate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity																// Sýnýfýmýzý kalýcý hale getiriyor
@Table(name="Personel_Maas")										//Tablo özelliklerimizi belirliyoruz biz tablomuza name özelliði ile isim verdik.
public class Personel implements Serializable	
{

	
	private static final long serialVersionUID = 1L;
	private Integer id;												//id deðiþkeni
	private String isim;											//Ýsim deðiþkeni
	private String soyisim;											//soyisim deðiþkeni
	private Integer maas;											//maas deðiþkeni
	
	
	
	
	public Personel() {												//Parametresiz yapýcýmýz
	}

	public Personel(String isim, String soyisim, Integer maas) 		//Parametreli yapýcýmýz	
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}
	
	@Id																// ID deðerimizi belirtiyoruz
	@GeneratedValue(strategy=GenerationType.AUTO)					//id deðerimizin otomatik artacaðýný strateji olarak belirtiyoruz
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
	public Integer getMaas() {
		return maas;
	}
	public void setMaas(Integer maas) {
		this.maas = maas;
	}
	
	
	
	
	
	
	
}
