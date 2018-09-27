package com.hareesh.absolutejava.console.projects;

import java.util.Scanner;

public class PigLatinName {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your firstname");
		String firstName = keyboard.nextLine();
		System.out.println("Enter your Lastname");
		String lastName = keyboard.nextLine();
		System.out.println(firstName.substring(0,1).toUpperCase()+firstName.substring(1) + " " + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
	}

}
