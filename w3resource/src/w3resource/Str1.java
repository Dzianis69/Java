package w3resource;

public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. Write a Java program to get the character at the given index within the String. Go to the editor

Sample Output:

Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i */
		 String str = "Java Exercises!";
	        System.out.println("Original String = " + str);
	        // Get the character at positions 0 and 10.
	        int index1 = str.charAt(0);
	        int index2 = str.charAt(10);

	        // Print out the results.
	        System.out.println("The character at position 0 is " +
	            (char)index1);
	        System.out.println("The character at position 10 is " +
	            (char)index2);
	    
		String str1="Java Exercises!";
		char zero=str1.charAt(0);
		char ten=str1.charAt(10);
		System.out.println(zero);
		System.out.println(ten);
	}

}
