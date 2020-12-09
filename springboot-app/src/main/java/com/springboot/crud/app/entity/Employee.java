package com.springboot.crud.app.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="radnik")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="ime")
	private String ime;
	
	@Column(name="prezime")
	private String prezime;
	
	@Column(name="email")
	private String email;
	
	@Column(name="broj_telefona")
	private String brojTelefona;
	
	@Column(name="adresa")
	private String adresa;
	
	@Column(name="datum_rodjenja")
	private Date datumRodjenja;
	
	@Column(name="sektor")
	private String sektor;
	
	@Column(name="datum_zaposlenja")
	private Date datumZaposlenja;

	public Employee() {
		
	}

	public Employee(String ime, String prezime, String email, String brojTelefona, String adresa, Date datumRodjenja,
			String sektor, Date datumZaposlenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.brojTelefona = brojTelefona;
		this.adresa = adresa;
		this.datumRodjenja = datumRodjenja;
		this.sektor = sektor;
		this.datumZaposlenja = datumZaposlenja;
	}

	public Employee(int id, String ime, String prezime, String email, String brojTelefona, String adresa,
			Date datumRodjenja, String sektor, Date datumZaposlenja) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.brojTelefona = brojTelefona;
		this.adresa = adresa;
		this.datumRodjenja = datumRodjenja;
		this.sektor = sektor;
		this.datumZaposlenja = datumZaposlenja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getSektor() {
		return sektor;
	}

	public void setSektor(String sektor) {
		this.sektor = sektor;
	}

	public Date getDatumZaposlenja() {
		return datumZaposlenja;
	}

	public void setDatumZaposlenja(Date datumZaposlenja) {
		this.datumZaposlenja = datumZaposlenja;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", email=" + email + ", brojTelefona="
				+ brojTelefona + ", adresa=" + adresa + ", datumRodjenja=" + datumRodjenja + ", sektor=" + sektor
				+ ", datumZaposlenja=" + datumZaposlenja + "]";
	}
	
	
	
	
}
