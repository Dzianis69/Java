package com.class6;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country,food;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Where are you from?");
		country=input.nextLine();
		
		switch(country) {
		
		case "USA":
			food="burger";
			break;
		case "Afghanistan":
			food="Palau";
			break;
		case "Russia":
			food="Pelemeni";
			break;
		case "Italy":
			food="pasta";
	break;	
		case "Turkey":
			food="Baklava";
			break;
		case "Belarus":
			food="Draniki";
			break;
			default:
				food="Ivalid counry";
		}
		System.out.println("Your favorite food is "+food);
	}

}
