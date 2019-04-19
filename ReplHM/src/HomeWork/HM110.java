package HomeWork;

/*
 * int aa;
String name;
float salary;
boolean value;
double age;
just take this instance variables in the main class and print the values
 for this in main method as we are not assigning the any values for them we should get default values 

THESE variables do not have any value attached to them, just call them in main method

Output:
0
null
0.0
false
0.0
 */
public class HM110 {
	int aa;
	String name;
	float salary;
	boolean value;
	double age;
	public static void main(String[] args) {
		HM110 obj = new HM110();
		System.out.println(obj.aa+"\n"+obj.name+"\n"+obj.salary+"\n"+obj.value+"\n"+obj.age);

	}

}
