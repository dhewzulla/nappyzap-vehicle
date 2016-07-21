package com.nappyzap.vehicle.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="vehiecle")
public class Vehicle {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@Column(name="plate_number")
	private String plateNumber;

	@Column(name="svailable_from")
	private Timestamp availableFrom;
	
	@Column(name="svailable_to")
	private Timestamp availableTo;

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public Timestamp getAvailableFrom() {
		return availableFrom;
	}

	public void setAvailableFrom(Timestamp availableFrom) {
		this.availableFrom = availableFrom;
	}

	public Timestamp getAvailableTo() {
		return availableTo;
	}

	public void setAvailableTo(Timestamp availableTo) {
		this.availableTo = availableTo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Vehicle(String plateNumber, Timestamp availableFrom, Timestamp availableTo) {
		super();
		this.plateNumber = plateNumber;
		this.availableFrom = availableFrom;
		this.availableTo = availableTo;
	}
	 public Vehicle(){
		 
	 }
	
}
