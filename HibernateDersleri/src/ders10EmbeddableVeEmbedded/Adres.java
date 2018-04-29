package ders10EmbeddableVeEmbedded;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adres implements Serializable
{
	

	private static final long serialVersionUID = 1L;
	
	private String mahalle;
	private String cadde;
	private String sokak;
	private Integer apNo;
	
	public Adres() 
	{
	}
	
	public Adres(String mahalle, String cadde, String sokak, Integer apNo) {
		super();
		this.mahalle = mahalle;
		this.cadde = cadde;
		this.sokak = sokak;
		this.apNo = apNo;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
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
