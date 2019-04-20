package HomeWork;

/*
 * Create the two Constructor with different parameters and try to call them in main method
create one method without parameter
create another method with String parameter
output would 
 
Welcome to the syntax solutions
I am the student in syntax solutions
 */
public class HM123 {
 Main() {
		System.out.println("Welcome to the syntax solutions");
	}

	Main(String s) {
		System.out.println("I am the student in syntax solutions");
	}
public static void main(String[] args) {
	Main obj = new Main();
	Main obj = new Main("Hey");
}
}
