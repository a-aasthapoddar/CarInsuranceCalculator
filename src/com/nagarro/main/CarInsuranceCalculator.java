package com.nagarro.main;
import java.util.ArrayList;
import java.util.List;

import com.nagarro.io.*;
import com.nagarro.model.*;
import com.nagarro.service.impl.InsurancePriceCalculation;

public class CarInsuranceCalculator
 {
	public static void main(String [] args) {
		System.out.println("Enter car details: ");
				
		List<Model> cars = new ArrayList<>();
		
		cars = UserInput.getInputFromUser();
		
		InsurancePriceCalculation.calculateInsurance(cars);
		
		Output.output(cars);
		
	}
}
