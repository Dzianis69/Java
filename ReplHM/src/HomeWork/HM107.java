package HomeWork;

/*
 * For you to do

Declare one local variable and one Instance variables in the class Main and access them in the main Method
Instance Variable as String Student1="John"

and declare one local variables as int batch=3

and access them in the main method

Output: 
John
3
 */
public class HM107 {
public	String Student1="John";

public static void main(String[] args) {
	int bath = 3;
	HM107 obj = new HM107();
	System.out.println(obj.Student1+"\n"+bath);
}
}
