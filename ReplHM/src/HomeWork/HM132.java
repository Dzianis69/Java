package HomeWork;
/*
 * 
super method calling 
create class Parent 
declare one instance method  write logic in println statement as
m1 method in parent class


create another class as Child  extends Parent class
declare two instance method in child class one method with same
 name as parent class method   write logic in println statement as
m1 method in child class
create another method m2 in child class call the child class method and parent class method in this method
in main method call the method which you created in the child class call the m2 method 

Output:
m1 method in child class
m1 method in parent class
 */
public class HM132 {

}
class Parent12 {
static	 void m1() {
		System.out.println("m1 static method in parent class");
	}
}
class Kid extends Parent12{
	static void m1() {
			System.out.println("m1 static method in child class");
		}
	static void m2() {
		 m1();
		Parent12.m1();
	 }
}

