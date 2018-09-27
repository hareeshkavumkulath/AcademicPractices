package com.hareesh.absolutejava.console.projects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BabylonianAlgorithm {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat dcFormat = new DecimalFormat("0.00");
		System.out.println("Enter a number");
		double number = keyboard.nextDouble();
		double guess = number/2;
		for(int i=0;i<5;i++) {
			double r = number/guess;
			guess = (guess + r)/2;
		}
		System.out.println(dcFormat.format(guess));
	}

}
