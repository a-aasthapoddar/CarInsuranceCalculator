package com.nagarro.io;

import com.nagarro.constant.Constant;

public class CarTypeFromCarNumber {
	public static String getCarTypeFromCarNumber(int carNumber) {
		String carType = "";
		switch(carNumber) {
		case 1:
			carType = Constant.carTypeHatchback;
			break;
		case 2:
			carType = Constant.carTypeSedan;
			break;
		case 3:
			carType = Constant.carTypeSUV;
			break;
		default: 
			carType = Constant.wrongCarType;
			System.out.println("Please choose a valid car type from options 1 to 3.");
		}
		return carType;
	}
}
