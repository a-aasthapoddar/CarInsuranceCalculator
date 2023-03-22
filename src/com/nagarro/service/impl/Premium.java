package com.nagarro.service.impl;

import com.nagarro.constant.Constant;
import com.nagarro.service.InsuranceType;

public class Premium implements InsuranceType {

	@Override
	public double calculateFinalInsuranceOfCar(double price) {
		
		try{
			double finalInsurancePrice = price + Constant.premium*price;
			return finalInsurancePrice;
		}catch(ArithmeticException e) {
			System.out.println("Divided by zero operation cannot possible");
		}
		return 0;
	}

}
