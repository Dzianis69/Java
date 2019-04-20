package HomeWork;

/*
 * Create the two default method with same name
create one default method in parent class
create the same private method within the child class
In main method create object with child class and call the child class Method

output would 

You should get the error message  "Private method in Child class "
 */
public class HM127 {
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.met();
	}
}

class Parent2 {
	public void met() {
		System.out.println("Private method in Parent class ");
	}
}

class Child2 extends Parent {
	public void met() {
		System.out.println("Private method in Child class ");
	}
}


