package ders5OneToMany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
