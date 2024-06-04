package com.ILPBatch4.utility;
import java.util.*;
public class Qstn4 {
	public static void main(String[] args) {
		//1^3+2^3+3^3+5^3+8^3...n^3
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=s.nextInt();
		int product, sum=0;
		
		
		for(int i=1;i<=n;i++) {
			product=i*i*i;
			sum=sum+product;
			
		}
			
		System.out.println(sum);
	}
}