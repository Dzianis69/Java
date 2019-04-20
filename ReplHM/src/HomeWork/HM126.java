package HomeWork;

/*
 * Create the two method with same name
create one method in parent class with two int parameters
 and write the logic in the method to print that values (a+b)
create another method in child with same name and extends 
the parent class with two int parameters and write the logic in the method to print that values (a+b)

In main method create object with child class and call the child class Method
pass the parameter values as 100, 200
 */
public class HM126 {
	public static void main(String[] args) {
		Chil obj = new Chil();
		obj.met(100, 200);
	}
}

class Paren {
	public void met(int a, int b) {
		System.out.println(a+b);
	}
}

class Chil extends Paren {
	public void met(int a, int b) {
		System.out.println(a+b);
	}
}


