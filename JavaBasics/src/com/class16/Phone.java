package com.class16;

public class Phone {
String made, model; 
boolean bluetooth, LTE;
int screen;


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone p1=new Phone();
p1.made="Nokia";
p1.model="1100";
p1.LTE=false;
p1.bluetooth=false;
p1.screen=2;
p1.call();


Phone p2=new Phone();
p2.made="Apple";
p2.model="4s";
p2.LTE=true;
p2.bluetooth=true;
p2.screen=4;
p2.watchWebinar();
p2.call();
p2.selfie();


Phone p3=new Phone();
p3.made="Samsung";
p3.model="Galaxy";
p3.LTE=true;
p3.bluetooth=true;
p3.screen=6;
p3.call();
p3.selfie();
p3.watchWebinar();

	}
	
	
void call() {
	System.out.println("You can call by your "+model);
}
void watchWebinar() {
	System.out.println("You can watch webinar if you are not in class student "+model);
}
void selfie() {
	System.out.println("You dont have to have a reason to take selfie");
}
}
