package com.hareesh.absolutejava.console.projects;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FuelConsumption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println("Enter miles");
		double miles = in.nextDouble();
		System.out.println("Enter fuel consumption rate");
		double mileage = in.nextDouble();
		System.out.println("Enter price of fuel");
		double price = in.nextDouble();
		System.out.println(moneyFormatter.format((miles/mileage)*price));
	}

}
