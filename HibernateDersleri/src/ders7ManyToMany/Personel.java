package ders7ManyToMany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @author Furkan KOÇ
 *
 */

@Entity																
public class Personel implements Serializable	
{

	private static final long serialVersionUID = 1L;
	private Integer id;												
	private String isim;											
	private String soyisim;											
	Set<Adres>adres=new HashSet<>();
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	public Set<Adres> getAdres() {
		return adres;
	}
	public void setAdres(Set<Adres> adres) {
		this.adres = adres;
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
	
	
}
