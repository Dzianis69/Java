package HomeWork;

/*
 * Declare the static variable  in the Main class
as static String ss="Welcome To Syntax Solutions"
and call the static variable in main method 
You need to call the static variable in three different ways
first way : By calling directly
Second way: By using the className
Third way: By creating the object of the class

Output:
Welcome To Syntax Solutions
Welcome To Syntax Solutions
Welcome To Syntax Solutions
 */
public class HM101 {
public static String ss ="Welcome To Syntax Solutions";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ss);
System.out.println(HM101.ss);
HM101 obj = new HM101();
System.out.println(HM101.ss);
	}

}
