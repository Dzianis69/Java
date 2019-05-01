package HomeWork;
/*
 * Create the two Constructor
create one Constructor  in parent class
write the logic as Parent class Constructor without parameter

create another Constructor in the child class
write the logic as Child class Constructor without parameter

In main method create object with child class and call the child class Method
output would 
Parent class Constructor without parameter
Child class Constructor without parameter
 */

 public class HM129 {
	 class Par{
Par(){
	System.out.println("Parent class Constructor without parameter");
}
}
class Kid extends Par {
	Kid(){
		System.out.println("Child class Constructor without parameter");
	}
}
 }
