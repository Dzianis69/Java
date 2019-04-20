package HomeWork;

/*
 * Write program to overload main method 

Write program to overload main method
For you to do create the another two more main method with different parameters and 
create one method with one string parameter
create the logic in it as "main(String arg1)"
create another method with two string parameters
create the logic in it as "main(String arg1, String arg2)"
call that two methods in main method
 
Output should
main(String arg1)
main(String arg1, String arg2)
 */
public class HM121 {
	public static void main(String arg1) {
		System.out.println("main(String arg1)");
	}
	public static void main(String arg1, String arg2) {
		System.out.println("main(String arg1, String arg2)");
	}
public static void main(String[] args) {
	main("Hi");
	main("Hey", "Hi");
	
}
}
