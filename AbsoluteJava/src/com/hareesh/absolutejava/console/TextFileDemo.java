package com.hareesh.absolutejava.console;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileDemo {

	public static void main(String[] args) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("test.txt"));					
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		}
		System.out.println("Text left to read? " + fileIn.nextLine());
		fileIn.close();
	}

}
