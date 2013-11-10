package timetable.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import timetablee.Ensure;





@Entity
@Table(name = "torte")
public class Torte extends BasePersistable {

	private static final long serialVersionUID = 1127398350055088704L;
	
	@Size(max = 255)
	@Null
	@Column(name = "bezeichnung", nullable = false, length = 255)
	private String bezeichnung;
	
	@Size(max = 255)
	@NotNull
	@Column(name = "anzZutaten", nullable = false, length = 255)
	private String anzZutaten;
	@Size(max = 255)
	@NotNull
	@Column(name = "menge", nullable = false, length = 255)
	private String menge;
	@Size(max = 255)
	@NotNull
	@Column(name = "tortenGroesse", nullable = false, length = 255)
	private String tortenGroesse;
	@Size(max = 255)
	@NotNull
	@Column(name = "preis", nullable = false, length = 255)
	private String preis;

	protected Torte() {
        // required for JPA
    }
	
	
	public Torte(String bezeichnung, String anzZutaten, String menge, String tortenGroesse, String preis) {
        Ensure.notEmpty("bezeichnung", bezeichnung);
        Ensure.notNull("anzZutaten", anzZutaten);
        Ensure.notEmpty("menge", menge);
        Ensure.notEmpty("tortenGroesse", tortenGroesse);
        Ensure.notEmpty("preis", preis);
        this.bezeichnung = bezeichnung;
        this.anzZutaten = anzZutaten;
        this.menge = menge;
		this.tortenGroesse = tortenGroesse;
		this.preis = preis;
    }
	
	

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getAnzZutaten() {
		return anzZutaten;
	}

	public void setAnzZutaten(String anzZutaten) {
		this.anzZutaten = anzZutaten;
	}

	public String getMenge() {
		return menge;
	}

	public void setMenge(String menge) {
		this.menge = menge;
	}

	public String getTortenGroesse() {
		return tortenGroesse;
	}

	public void setTortenGroesse(String tortenGroesse) {
		this.tortenGroesse = tortenGroesse;
	}

	public String getPreis() {
		return preis;
	}

	public void setPreis(String preis) {
		this.preis = preis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
