package HomeWork;

/*
 * Write program to overload static method

Create the two static method with different parameters and try to call them in main method
create one method without parameter
create another method with int parameter

output would 
 
M1 method without parameter
M1 method with int parameter
 */
public class HM120 {
	public static void met() {
		System.out.println("M1 method without parameter");
	}

	public static void met(int n) {
		System.out.println("M1 method with int parameter");
	}

	public static void main(String[] args) {
		met();
		met(69);
	}
}
