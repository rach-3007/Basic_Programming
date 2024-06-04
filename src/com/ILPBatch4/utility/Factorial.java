package com.ILPBatch4.utility;

public class Factorial {

	public static void main(String[] args) {
		int input=3;
		Factorials(input);
	}
		public static void Factorials(int input)
		{
			float product=1;
			float sum=0f, fraction=0f;
			for(int i =1;i<=input;i++) {
				for(int j=1;j<=i;j++)					
			product= product* j;
				fraction = i/product;
				sum = sum+fraction;
				product=1;
			}
			System.out.println("Factorial : "+ sum);
		}
		}