package com.class10;

public class TolyChallenge {

	public static void main(String[] args) {


int temp=1;
   for(int i=4;i>0;i--) {
       for(int b=1;b<=i;b++) {
           System.out.print(" ");
       }
       //int temp=1;
       for(int c=1;c<=temp;c++) {
       System.out.print("* ");
       }
       System.out.println();
       temp++;
   }
	}
}