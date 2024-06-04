package com.ILPBatch4.utility;

public class Pattern_1 {
	public static void main(String[] args) {
		
		
		int input = 4;

		for(int i =1;i<=input;i++) {
			for(int j=input;j>=1;j--) {
				
				if(j<=i && j!=1)
					System.out.print(j+" ");
				else if(j>i)
					System.out.print("  ");
				else{
				System.out.print(j+" ");
				for(int k =1+j;k<=i;k++)
					System.out.print(k+" ");
				}
			}
			System.out.println();	
			}	
		for (int i = 1; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            
            for (int j = input - i; j >= 1; j--) {
                System.out.print(j+" ");
            }

            for (int j = 2; j <= input - i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
	
}

}
