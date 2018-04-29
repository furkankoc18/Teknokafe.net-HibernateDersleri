package ders2Tanitim;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity						// class�m�z� kal�c� hale getiriyor(Kullan�lmas� zorunlu)
@Table(name="PERSONEL")		// Olu�turulacak tablomuza isim atad�k
public class Personel implements Serializable
{
	
	
	private static final long serialVersionUID = 1L;
	private Integer personel_id;
	private String personel_isim;
	private String personel_soyisim;
	private Integer personel_maas;
	
	
	@Id								//	 Bu de�i�kenin id de�eri oldu�unu belirtiyoruz(Kullan�lmas� zorunlu)
	@Column(name="PERSONEL_ID")		// 	Kolonumuzun ismini belirledik
	public Integer getPersonel_id() {
		return personel_id;
	}
	public void setPersonel_id(Integer personel_id) {
		this.personel_id = personel_id;
	}
	@Column(name="PERSONEL_ISIM")	// 	Kolonumuzun ismini belirledik
	public String getPersonel_isim() {
		return personel_isim;
	}
	public void setPersonel_isim(String personel_isim) {
		this.personel_isim = personel_isim;
	}
	@Column(name="PERSONEL_SOYISIM")	// 	Kolonumuzun ismini belirledik
	public String getPersonel_soyisim() {
		return personel_soyisim;
	}
	public void setPersonel_soyisim(String personel_soyisim) {
		this.personel_soyisim = personel_soyisim;
	}
	@Column(name="PERSONEL_MAAS")	// 	Kolonumuzun ismini belirledik
	public Integer getPersonel_maas() {
		return personel_maas;
	}
	public void setPersonel_maas(Integer personel_maas) {
		this.personel_maas = personel_maas;
	}
	
	
	
	

}
