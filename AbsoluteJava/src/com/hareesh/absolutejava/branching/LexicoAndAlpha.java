package com.hareesh.absolutejava.branching;

import java.util.Scanner;

public class LexicoAndAlpha {
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String firstWord = keyboard.nextLine();
		String secondWord = keyboard.nextLine();
		System.out.println("Lexicographical compareTo()");
		System.out.println(firstWord.compareTo(secondWord));
		System.out.println("Alphabetical compareTo()");
		System.out.println(firstWord.compareToIgnoreCase(secondWord));
	}

}
