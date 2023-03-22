package com.nagarro.service.impl;

import com.nagarro.constant.Constant;
import com.nagarro.service.CarType;

public class Sedan implements CarType {

	@Override
	public double calculateInsuranceOfCar(double priceOfCar) {
					
		try{
			double insuranceRate = Constant.sedan*priceOfCar;
			return insuranceRate;
		}catch(ArithmeticException e) {
			System.out.println("Divided by zero operation cannot possible");
		}
		return 0;
		
	}

}
