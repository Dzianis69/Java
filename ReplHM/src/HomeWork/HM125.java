package HomeWork;

/*
 * Create the two static method with same name
create one method in parent class
write the logic as "Parent m1()"
create another method with same in the child class
Write the logic "Child m1()"
In main method create object with child class and call the child class Method
output would 

Child m1()
 */
public class HM125 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.met();
	}
}

class Parent {
	

	public void met() {
		System.out.println("Parent m1()");
	}
}

class Child extends Parent {
	public void met() {
		System.out.println("Child m1()");
	}
}
