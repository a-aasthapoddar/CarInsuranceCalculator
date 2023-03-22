package com.nagarro.io;

import java.util.Iterator;
import java.util.List;

import com.nagarro.model.Model;

public class Output {
	public static void output(List<Model> cars){
			
		Iterator<Model> iterator = cars.iterator();
		while(iterator.hasNext()) {
			Model car = iterator.next();
			System.out.println("Car Name - "+ car.getCarModel());
			System.out.println("Car Type - "+ car.getCarType());
			System.out.println("Car Price - "+ car.getCarPrice());
			System.out.println("Insurance Type - "+ car.getInsuranceType());
			System.out.println("Final Insurance Price of the Car - "+ car.getFinalInsurancePrice());
			System.out.println();
		}
	 }
}
