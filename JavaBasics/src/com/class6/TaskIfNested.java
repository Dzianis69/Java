package com.class6;

import java.util.Scanner;

public class TaskIfNested {
public static void main(String[] args) {
	int  weather;
	boolean rain,snow,sunny;
	String activity;
	
	Scanner input=new Scanner(System.in);
	System.out.println("What is the weather today?");
	weather=input.nextInt();
	
	if(weather>40 && weather<80  ) {
		System.out.println("Is it raining?");
		rain=input.nextBoolean();
		if(rain) {
			activity="We stay at home";
		}else {
			activity="We go hiking";
		}
	}else if(weather>25 && weather<40  ) {
		System.out.println("Is it snowing?");
		snow=input.nextBoolean();
		if(snow) {
			activity="We stay at home";
		}else {
			activity="We go snowboarding";
		}
		}else if(weather>80  ) {
			System.out.println("Is it sunny?");
			sunny=input.nextBoolean();
			if(sunny) {
				activity="We go beaching";
			}else {
				activity="We stay at home";
			}
		
		}else {
			activity="Stay at home";
		}
			
	System.out.println("Our plan is "+activity);
	}
}
