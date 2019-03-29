package com.class4;

public class TaskFour {
	public static void main(String[] args) {
		double mortgageRate=5;
		int housePrice=50000;
		int cashInPocket=200000;
		double allowRate=4.5;
		if(mortgageRate>allowRate) {
			System.out.println("I will not buy it");
		}else {
			System.out.println("I will buy it");
			if(housePrice<=cashInPocket) {
				System.out.println("I will pay cash");
			}else {
				System.out.println("I need to take a loan");
			}
		}
		}
	}


