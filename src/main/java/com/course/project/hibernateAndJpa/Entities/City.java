package com.course.project.hibernateAndJpa.Entities;

import javax.persistence.*;
@Entity
@Table(name="city")

public class City {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="district")
	private String district;
	@Column(name="population")
	private String population;
	@Column(name="countryCode")
	private String countryCode;
	public City(int id, String name, String district, String population, String countryCode) {
		super();
		this.id = id;
		this.name = name;
		this.district = district;
		this.population = population;
		this.countryCode = countryCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
}
