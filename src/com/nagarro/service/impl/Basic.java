package com.nagarro.service.impl;

import com.nagarro.service.InsuranceType;

public class Basic implements InsuranceType {

	@Override
	public double calculateFinalInsuranceOfCar(double price) {
		
		return price;
	}

}
