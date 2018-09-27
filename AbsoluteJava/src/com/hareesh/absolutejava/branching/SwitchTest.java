package com.hareesh.absolutejava.branching;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		switch (number) {
		case 1:
			System.out.println("Entered number is One");
			break;
		case 2:
			System.out.println("Entered number is Two");
			break;
		default:
			break;
		}
	}

}
