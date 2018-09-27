package com.hareesh.absolutejava.console.projects;

import java.util.Scanner;

public class Mathematics {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Sum = " + (a+b));
		System.out.println("Difference = " + (a-b));
		System.out.println("Product = " + (a*b));
	}

}
