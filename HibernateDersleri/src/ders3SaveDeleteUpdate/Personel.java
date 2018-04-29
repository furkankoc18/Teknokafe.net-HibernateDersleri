package ders3SaveDeleteUpdate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity																// S�n�f�m�z� kal�c� hale getiriyor
@Table(name="Personel_Maas")										//Tablo �zelliklerimizi belirliyoruz biz tablomuza name �zelli�i ile isim verdik.
public class Personel implements Serializable	
{

	
	private static final long serialVersionUID = 1L;
	private Integer id;												//id de�i�keni
	private String isim;											//�sim de�i�keni
	private String soyisim;											//soyisim de�i�keni
	private Integer maas;											//maas de�i�keni
	
	
	
	
	public Personel() {												//Parametresiz yap�c�m�z
	}

	public Personel(String isim, String soyisim, Integer maas) 		//Parametreli yap�c�m�z	
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}
	
	@Id																// ID de�erimizi belirtiyoruz
	@GeneratedValue(strategy=GenerationType.AUTO)					//id de�erimizin otomatik artaca��n� strateji olarak belirtiyoruz
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
