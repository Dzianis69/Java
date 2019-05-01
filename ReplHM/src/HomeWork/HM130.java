package HomeWork;

/*
 * create class Parent 
Declare two variables 
int a=10,int b=20;

create another class Child  extends Parent
declared two variables 
int a=30,int b=40;

create method in child class with parameter pass two parameters as int a,int b

write the logic to perform the addition the parent variables, class variables
 and local variables in method use the super and this keyword for this 

in main method call the method which you created in the child class pass the parameters in method values as 50,60

Output:
110
70
30
 */
public class HM130 {
	

}

class Parent69 {
	int a = 10;
	int b = 20;
}

class Child23 extends Parent69 {
	int a = 30;
	int b = 40;

	public void getSum(int a, int b) {
		System.out.println(a + b);
		System.out.println(this.a + this.b);
		System.out.println(super.a + super.b);

	}
}
