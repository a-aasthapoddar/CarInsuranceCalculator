package com.nagarro.service.impl;

import java.util.Iterator;
import java.util.List;

import com.nagarro.constant.Constant;
import com.nagarro.model.Model;
import com.nagarro.service.*;

public class InsurancePriceCalculation {
	public static List<Model> calculateInsurance(List<Model> cars){
		double insurancePrice = 0;
		
		Iterator<Model> iterator = cars.iterator();
		while(iterator.hasNext()) {
			Model car = iterator.next();
			
			double finalInsurancePrice;
			CarType typeOfCar;
			if(car.getCarType().equalsIgnoreCase(Constant.carTypeHatchback))
				typeOfCar = new Hatchback();
			else if(car.getCarType().equalsIgnoreCase(Constant.carTypeSedan))
				typeOfCar = new Sedan();
			else
				typeOfCar = new SUV();
			
			insurancePrice = typeOfCar.calculateInsuranceOfCar(car.getCarPrice());
			car.setInsurancePrice(insurancePrice);
			
			InsuranceType typeOfInsurance;			
			if(car.getInsuranceType().equalsIgnoreCase(Constant.insuranceTypePremium))
				typeOfInsurance = new Premium();
			else
				typeOfInsurance = new Basic();
			
			finalInsurancePrice = typeOfInsurance.calculateFinalInsuranceOfCar(insurancePrice);
			car.setFinalInsurancePrice(finalInsurancePrice);
			
			
		}
		return cars;
	}
}
