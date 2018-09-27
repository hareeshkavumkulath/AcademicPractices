package com.hareesh.absolutejava.console;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = keyboard.nextInt();
		System.out.println("Enter your name");
		keyboard.nextLine();
		String name = keyboard.nextLine();
		System.out.println(name + ", you are " + age + " years old");
	}
	
}
