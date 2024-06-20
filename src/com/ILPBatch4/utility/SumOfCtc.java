package com.ILPBatch4.utility;

public class SumOfCtc {

	public static void main(String[] args) {
		int input=10;
		Sumoftheseries(input);
	}
		public static void Sumoftheseries(int input)
		{
			int sum=0;
			for(int i =1;i<=input;i++)
				sum= sum + i;
			System.out.println("Sum : "+ sum);
		}
		}
