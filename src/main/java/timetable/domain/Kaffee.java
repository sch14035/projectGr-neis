package timetable.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import timetablee.Ensure;




@Entity
@Table(name = "kaffee")
public class Kaffee extends BasePersistable {

	
	 private static final long serialVersionUID = -3987457976754795091L;
	
	 @Size(max = 255)
		@Null
		@Column(name = "name", nullable = false, length = 255)
		private String name;
	 @Size(max = 255)
		@Null
		@Column(name = "preis", nullable = false, length = 255)
		private String preis;
	 @Size(max = 255)
		@Null
		@Column(name = "menge", nullable = false, length = 255)
		private String menge;
	 @Size(max = 255)
		@Null
		@Column(name = "herkunft", nullable = false, length = 255)
		private String herkunft;
	 @Size(max = 255)
		@Null
		@Column(name = "art", nullable = false, length = 255)
		private String art;
	 @Size(max = 255)
		@Null
		@Column(name = "alterkaffebohnen", nullable = false, length = 255)
		private String alterkaffeebohnen;
	 
	 public Kaffee(String name, String preis, String menge, String herkunft, String art,String alterkaffeebohnen) {
	        Ensure.notEmpty("name", name);
	        Ensure.notNull("preis", preis);
	        Ensure.notEmpty("menge", menge);
	        Ensure.notEmpty("herkunfte", herkunft);
	        Ensure.notEmpty("art", art);
	        Ensure.notEmpty("alterkaffeebohnen", alterkaffeebohnen);
	        this.name = name;
	        this.preis = preis;
	        this.menge = menge;
			this.herkunft = herkunft;
			this.art = art;
			this.alterkaffeebohnen = alterkaffeebohnen;
	    }
	 
	 
	 protected Kaffee() {
	        // required for JPA
	    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPreis() {
		return preis;
	}


	public void setPreis(String preis) {
		this.preis = preis;
	}


	public String getMenge() {
		return menge;
	}


	public void setMenge(String menge) {
		this.menge = menge;
	}


	public String getHerkunft() {
		return herkunft;
	}


	public void setHerkunft(String herkunft) {
		this.herkunft = herkunft;
	}


	public String getArt() {
		return art;
	}


	public void setArt(String art) {
		this.art = art;
	}


	public String getAlterkaffeebohnen() {
		return alterkaffeebohnen;
	}


	public void setAlterkaffeebohnen(String alterkaffeebohnen) {
		this.alterkaffeebohnen = alterkaffeebohnen;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
}
