package HomeWork;
/*
 * create class Parent 
declare one constructor here with one argument

create another class as Child  
declare one constructor here without any arguments 
and call the parent class constructor by using super keyword

create another Constructor in class  Child  
declare another constructor here with any arguments 
and call the parent class constructor by using super keyword


in main method call create object for child class with without any parameter
create another object with one argument

Output:
 
Parent Constructor in parent class with one argument
Child Constructor in child class with zero argument
Parent Constructor in parent class with one argument
Child Constructor in child class with one argument
 


 */
public class HM134 {
public static void main(String[] args) {
	 new Child11();
	 new Child11(1);
	
}
}
class Parent11{
	Parent11(int i){
		System.out.println("Parent Constructor in parent class with one argument");
	}
}
class Child11 extends Parent11{
	Child11(){
		super(1);
		System.out.println("Child Constructor in child class with zero argument");
	}
	Child11(int i){
		super(1);
		System.out.println("Child Constructor in child class with one argument");
	}
	
}
