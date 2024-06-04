package com.ILPBatch4.utility;

public class pattern12th {
	public static void main(String[] args) {
	int input = 5;
	patters(input);

	}
private static void patters(int input) {
	for (int i = 0; i < input; i++) {

		for (int j = 0; j < input; j++) {
			if (i == 0 || i == input - 1 || i + j == input - 1) 
				System.out.print("*");
			else 
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


