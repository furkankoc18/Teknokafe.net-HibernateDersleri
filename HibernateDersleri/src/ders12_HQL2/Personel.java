package ders12_HQL2;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import org.hibernate.annotations.NamedNativeQuery;

@Entity
@NamedQueries
({
	@NamedQuery(name="butunVerileriCek",query="from Personel"),
	@NamedQuery(name="personelCek_id",query="from Personel p where p.id= :no")
})
@NamedNativeQuery(name="normalSQLTum",query="Select * from Personel",resultClass=Personel.class)
public class Personel implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String isim;
	private String soyisim;
	private int maas;
	
	
	
	public Personel() {
	}
	public Personel(String isim, String soyisim, int maas) 
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
}
