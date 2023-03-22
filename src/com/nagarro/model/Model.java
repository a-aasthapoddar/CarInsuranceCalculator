package com.nagarro.model;

import com.nagarro.constant.Constant;

public class Model {
	private String carModel;
	private String carType;
	private double carPrice;
	private String insuranceType;
	private double finalInsurancePrice;
	
	public double getFinalInsurancePrice() {
		return finalInsurancePrice;
	}
	public void setFinalInsurancePrice(double finalInsurancePrice) {
		this.finalInsurancePrice = finalInsurancePrice;
	}
	public double getInsurancePrice() {
		return insurancePrice;
	}
	public void setInsurancePrice(double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}

	private double insurancePrice;
	
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) { 
		this.carModel = carModel;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

}
