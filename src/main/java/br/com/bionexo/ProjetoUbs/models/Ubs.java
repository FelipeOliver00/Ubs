package br.com.bionexo.ProjetoUbs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ubs")
public class Ubs {

	@Id
	@Column(name = "cod_cnes")
	private long id_ubs;
	
	@Column(name = "nom_estab")
	private String name;
	
	@Column(name = "dsc_endereco") 
	private String address;
	
	@Column(name = "dsc_cidade") 
	private String city;
	
	@Column(name = "dsc_telefone") 
	private String phone;
	
	@Column(name = "vlr_latitude") 
	private int geocode_alt;
	
	@Column(name = "vlr_longitude") 
	private int geocode_long;
	
	@Column(name = "dsc_estrut_fisic_ambiencia") 
	private String scores_size;
	
	@Column(name = "dsc_adap_defic_fisic_idosos") 
	private String scores_adaptation_for_seniors;
	
	@Column(name = "dsc_equipamentos") 
	private String scores_medical_equipment;
	
	@Column(name = "dsc_medicamentos")
	private String scores_medicine;
	
	
	public Ubs() {}

	public Ubs(long id_ubs, String name, String address, String city, 
			String phone, int geocode_alt, int geocode_long, String scores_size,
			String scores_adaptation_for_seniors, String scores_medical_equipment,
			String scores_medicine
			) {
		super();
		this.id_ubs = id_ubs;
		this.name = name;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.geocode_long = geocode_long;
		this.scores_size = scores_size;
		this.scores_adaptation_for_seniors =scores_adaptation_for_seniors;
		this.scores_medical_equipment = scores_medical_equipment;
		this.scores_medicine = scores_medicine;
	}
	
	
	
	public String getScores_adaptation_for_seniors() {
		return scores_adaptation_for_seniors;
	}

	public void setScores_adaptation_for_seniors(String scores_adaptation_for_seniors) {
		this.scores_adaptation_for_seniors = scores_adaptation_for_seniors;
	}

	public String getScores_medical_equipment() {
		return scores_medical_equipment;
	}

	public void setScores_medical_equipment(String scores_medical_equipment) {
		this.scores_medical_equipment = scores_medical_equipment;
	}

	public String getScores_medicine() {
		return scores_medicine;
	}

	public void setScores_medicine(String scores_medicine) {
		this.scores_medicine = scores_medicine;
	}

	public String getScores_size() {
		return scores_size;
	}

	public void setScores_size(String scores_size) {
		this.scores_size = scores_size;
	}

	public int getGeocode_long() {
		return geocode_long;
	}

	public void setGeocode_long(int geocode_long) {
		this.geocode_long = geocode_long;
	}

	public int getGeocode_alt() {
		return geocode_alt;
	}

	public void setGeocode_alt(int geocode_alt) {
		this.geocode_alt = geocode_alt;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getId_ubs() {
		return id_ubs;
	}

	public void setId_ubs(long id_ubs) {
		this.id_ubs = id_ubs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	 
	
	
	
	
}
