package com.ILPBatch4.utility;

public class Qstn2 {
	public static void main (String args[]) {
		int a = 4, b = 3, c = 6, d = 9;

	
	ascending(a, b, c, d);

}

public static void ascending(int a, int b, int c, int d) {
	if (a < b && a < c && a < d) {
		System.out.println(a + " ");

		if (b < c && b < d) {
			System.out.println(b + " ");

			if (c < d) {
				System.out.println(c + " ");
				System.out.println(d + " ");
			} else {
				System.out.println(d + " ");
				System.out.println(c + " ");
			}
		}
	}

	else if (b < a && b < c && b < d) {
		System.out.println(b + " ");

		if (a < c && a < d) {
			System.out.println(a + " ");

			if (c < d) {
				System.out.println(c + " ");
				System.out.println(d + " ");
			} else {
				System.out.println(d + " ");
				System.out.println(c + " ");
			}
		}
	}

	else if (c < a && c < b && c < d) {
		System.out.println(c + " ");

		if (a < b && a < d) {
			System.out.println(a + " ");

			if (b < d) {
				System.out.println(b + " ");
				System.out.println(d + " ");
			} else {
				System.out.println(d + " ");
				System.out.println(b + " ");
			}
		}
	}
	else {
		System.out.println(d + " ");

		if (a < b && a < d) {
			System.out.println(a + " ");

			if (b < d) {
				System.out.println(b + " ");
				System.out.println(d + " ");
			} else {
				System.out.println(d + " ");
				System.out.println(b + " ");
			}
		}
	}
}
}

