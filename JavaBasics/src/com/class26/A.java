package com.class26;

//2. Write program in class A has final display method
//and try overload and override this method and observe result .
public class A {
	final void method() {
		System.out.println("no para");
	}
	final void method(int a) {
		System.out.println(" para int ");
	}
	final void method(String s,int b) {
		System.out.println("string and int");
	}

}
class B extends A{
	 void method() {
		System.out.println("no para");
	}
}
q	
