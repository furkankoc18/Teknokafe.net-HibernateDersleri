package ders10EmbeddableVeEmbedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Personel_Bilgileri")
public class Personel implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String isim;
	private String soyisim;
	private Integer maas;
	
	Adres adres=new Adres();

	
	
	public Personel(String isim, String soyisim, Integer maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}
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
	@Column(name="maas")
	public Integer getMaas() {
		return maas;
	}
	public void setMaas(Integer maas) {
		this.maas = maas;
	}
	@Embedded
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}	
}
