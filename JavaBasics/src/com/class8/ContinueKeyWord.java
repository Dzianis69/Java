package com.class8;

public class ContinueKeyWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=10;i++) {
	if(i==2) {
		continue;
	}else if(i==4 || i==5) {
		continue;
	}
	System.out.println(i);
	System.out.println("Hi");
}
System.out.println("I am outside of for loop");
for(int a=1;a<=20;a++) {
	if(a%3==0) {
		continue;
	}
	System.out.println(a);
}
	}

}

