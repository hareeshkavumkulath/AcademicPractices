package com.hareesh.absolutejava.console;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatDemo {

	public static void main(String[] args) {
		System.out.println("Without formatting");
		
		System.out.println("19.8");
		System.out.println("19.81111");
		System.out.println("19.89999");
		System.out.println("19");
		System.out.println();
		
		System.out.println("Default Location");
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		System.out.println(moneyFormatter.format(19.8));
		System.out.println(moneyFormatter.format(19.81111));
		System.out.println(moneyFormatter.format(19.89999));
		System.out.println(moneyFormatter.format(19));
		System.out.println();
		
		System.out.println("US as Location");
		NumberFormat moneyFormatter2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(moneyFormatter2.format(19.8));
		System.out.println(moneyFormatter2.format(19.81111));
		System.out.println(moneyFormatter2.format(19.89999));
		System.out.println(moneyFormatter2.format(19));
		System.out.println();
		
		System.out.println("CANADA as Location");
		NumberFormat moneyFormatter3 = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println(moneyFormatter3.format(19.8));
		System.out.println(moneyFormatter3.format(19.81111));
		System.out.println(moneyFormatter3.format(19.89999));
		System.out.println(moneyFormatter3.format(19));
		System.out.println();
	}

}
