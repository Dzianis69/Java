package com.class5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int discount, price;
		double finalPrice;
		boolean sale;
		Scanner input = new Scanner(System.in);
		System.out.println("Is it any sales?");
		sale = input.nextBoolean();
		
		if (sale) {
			System.out.println("What is the price?");
			price = input.nextInt();
			System.out.println("Lets check discount");
if(price<20) {
	
	
	discount=20;
	finalPrice=price-price*0.2;
}else if(price>20 && price<100) {
	discount=30;
	finalPrice=price-(price*0.3);
}else if(price>100 && price<500) {
	discount = 50;
	finalPrice=price-(price*0.5);
}else {
	discount=75;
	finalPrice=price-(price*0.75);
}
System.out.println("final price is "+finalPrice);
		} else {
			System.out.println("not interested");
		}


	}

}
