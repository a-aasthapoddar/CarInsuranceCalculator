package com.nagarro.io;

import java.util.*;

import com.nagarro.constant.Constant;
import com.nagarro.model.Model;

public class UserInput {
	public static List<Model> getInputFromUser() {
		Scanner sc = new Scanner(System.in);
		List<Model> cars = new ArrayList<>();

		char choice;
		String carModel;
		String carType = "";
		Double carPrice;
		String insuranceType;
		String value;
		int carNumber;

		do {
			Model details = new Model();
			int count = 0;

			System.out.println("Enter a valid car model name: ");
			carModel = getInputOfDetails();
			details.setCarModel(carModel);

			do {
				count++;
				if (count > 3) {
					System.out.println("Entered incorrect input many times. Please re-run the program.");
					System.exit(0);
				}
				System.out.println("Enter a valid car price: ");
				value = getInputOfDetails();
				while (true) {
					try {
						carPrice = Double.parseDouble(value);
						break;
					} catch (NumberFormatException e) {
						System.out.println("Incorrect Input. Enter again.");
					}
					value = getInputOfDetails();
				}
			} while (carPrice <= 0);
			count = 0;

			details.setCarPrice(carPrice);

			do {
				count++;
				if (count > 3) {
					System.out.println("Entered incorrect input many times. Please re-run the program.");
					System.exit(0);
				}
				System.out.println("Choose car type number - \n 1.Hatchback \n 2.Sedan \n 3.SUV");
				value = getInputOfDetails();
				while (true) {
					try {
						if(value.equalsIgnoreCase(Constant.carTypeHatchback) || value.equalsIgnoreCase(Constant.carTypeSedan) || value.equalsIgnoreCase(Constant.carTypeSUV)) {
							carType = value;
						}else {
							carNumber = Integer.parseInt(value);
							carType = CarTypeFromCarNumber.getCarTypeFromCarNumber(carNumber);
						}
						break;
					} catch (Exception e) {
						System.out.println("Incorrect car type. Please enter again.");
					}
					value = getInputOfDetails();
				}
				

			} while (carType.equals(Constant.wrongCarType));
			details.setCarType(carType);

			count = 0;

			do {
				count++;
				if (count > 3) {
					System.out.println("Entered incorrect input many times. Please re-run the program.");
					System.exit(0);
				}
				System.out.println("Select an insurance type: Basic or Premium.");
				insuranceType = getInputOfDetails();
			} while (!insuranceType.equalsIgnoreCase(Constant.insuranceTypeBasic)
					&& !insuranceType.equalsIgnoreCase(Constant.insuranceTypePremium));
			details.setInsuranceType(insuranceType);

			cars.add(details);
			System.out.println("Do you want to enter details of any other car (y/n):");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

		return cars;
	}

	private static String getInputOfDetails() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();

		while (inputString != null && inputString.trim().length() == 0) {
			if (inputString.isEmpty() || inputString.trim().length() == 0)
				System.out.println("Please enter a value: ");
			else
				break;
			inputString = sc.nextLine();
		}
		return inputString;

	}
}
