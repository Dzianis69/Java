package HomeWork;
/*
 * Create the two method with same name
create one protected method in parent class 
write the logic as "Protected method in parent class"
create same public method within  the child class and extends the parent class
write the logic as "public method in parent class"
In main method create object with Parent  class and call the parent  class Method
 */
public class HM128 {
	public static void main(String[] args) {
		Parent3 obj = new Parent3();
		obj.met();
	}
}

class Parent3 {
	protected void met() {
		System.out.println("Protected method in parent class");
	}
}

class Child3 extends Parent {
	public void met() {
		System.out.println("public method in parent class");
	}
}


