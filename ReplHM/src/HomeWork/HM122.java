package HomeWork;

/*
 * Create two private method with different parameters and try to call them in main method
create one method without parameter
create another method with int parameter

output would 

private m1 method 
private m1 method with int parameter
 */
public class HM122 {
	private static void met() {
		System.out.println("private m1 method ");
	}

	private static void met(int a) {
		System.out.println("private m1 method with int parameter");
	}

	public static void main(String[] args) {
		met();
		met(69);
	}
}
