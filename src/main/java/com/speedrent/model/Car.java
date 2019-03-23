package com.speedrent.model;

public class Car {
	
	private String manufacturer;
	
	private String name;

	public Car() {
		
	}
	
	public Car(String manufacturer, String name) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
