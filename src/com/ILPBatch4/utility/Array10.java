package com.ILPBatch4.utility;

public class Array10 {
	public static void main(String[] args) {
		int array[] = { 2, 4, 5, 1, 3, 3 };
		int number = 6;
		arrayPair(array, number);
	}

	private static void arrayPair(int[] array, int number) {
		int count = 0;
		for (int i = 0; i <=array.length - 1; i++) {
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i] + array[j] == number) {
					System.out.print(array[i]+" " + array[j]);
					count++;
				}
			}
			System.out.println();

		}
		
		System.out.println("Number of Pair : " + count);
	}
}


