package com.ILPBatch4.utility;

public class RightTriangle {
    public static void main(String[] args) {
        int input =5;
        rightTriangleStar(input);
    }
    public static void rightTriangleStar(int input){
        for(int i=0;i<input;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
