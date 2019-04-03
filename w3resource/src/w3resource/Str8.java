package w3resource;

public class Str8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*8. Write a Java program to test if a given string contains the specified sequence of char values. Go to the editor

Sample Output:

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and                                                                        
true */
		String str="PHP Exercises and Python Exercises";
		boolean boo=str.contains("and");
		System.out.println(boo);
	}

}
