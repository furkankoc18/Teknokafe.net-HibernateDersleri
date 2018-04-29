package ders6ManyToOne;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * 
 * @author Furkan KOÇ
 *
 */


@Entity
public class Adres implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Integer adresId;
	private String cadde;
	private String mahalle;
	private String sokak;
	private Integer apNo;
	
	
	private Personel personel=new Personel();
	
	public Adres() {
		
	}
	
	
	
	
	public Adres(String cadde, String mahalle, String sokak, Integer apNo, Personel personel) {
		super();
		this.cadde = cadde;
		this.mahalle = mahalle;
		this.sokak = sokak;
		this.apNo = apNo;
		this.personel = personel;
	}




	@ManyToOne(cascade=CascadeType.ALL)
	public Personel getPersonel() {
		return personel;
	}
	public void setPersonel(Personel personel) {
		this.personel = personel;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getAdresId() {
			return adresId;
	}
	public void setAdresId(Integer adresId) {
		this.adresId = adresId;	
	}
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	public Integer getApNo() {
		return apNo;
	}
	public void setApNo(Integer apNo) {
		this.apNo = apNo;
	}
	
	
	
	
	
	
	
}
