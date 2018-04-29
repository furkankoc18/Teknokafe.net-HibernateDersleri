package ders9SecondaryTable;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;





@Entity
@SecondaryTable(name="Personel_Maas")
public class Personel implements Serializable
{

	public Personel(String isim, String soyisim, Integer maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}
	
	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String isim;
	private String soyisim;
	private Integer maas;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="isim")
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	@Column(name="soyisim")
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	
	@Column(name="maas_miktari",table="Personel_Maas")
	public Integer getMaas() {
		return maas;
	}
	public void setMaas(Integer maas) {
		this.maas = maas;
	}
	
	
	
	
}
