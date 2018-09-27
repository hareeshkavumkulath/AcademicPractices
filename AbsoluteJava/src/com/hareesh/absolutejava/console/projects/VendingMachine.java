package com.hareesh.absolutejava.console.projects;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the price of the item");
		int price = in.nextInt();
		int difference = 100 - price;
		int quarters = difference / 25;
		difference = difference - (quarters * 25);
		int dimes = difference / 10;
		difference = difference - (dimes * 10);
		int nickels = difference / 5;
		System.out.println(quarters + " quarters, " + dimes + " dimes and " + nickels + " nickels");
	}

}
