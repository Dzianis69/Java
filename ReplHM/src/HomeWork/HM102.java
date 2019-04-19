package HomeWork;

/*
 * For you to do,

Declare the static method and in the static method write the logic to print the static variables 

In main method pass the values for the static variables as 
 age=40;
name="John"
and call the static method in static way only
Do not create an object

Output:
40
John
 */
public class HM102 {
public static int age;
public static String name;
	public static void stat(int age, String name) {
		System.out.println(age+"\n"+name );
	}
	public static void main(String[] args) {
		HM102.age = 40;
		HM102.name = "John";
		stat(age, name);
	}
}
