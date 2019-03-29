package JavaRush;

import java.util.Scanner;

public class HM74 {
	/*
	 * For you to do:
	 * 
	 * If language is Java It should print the Java is a programming language. If
	 * language is C It should print the C is a procedural programming language If
	 * language is C++ It should print the C++ is a middle-level programming
	 * language If any other should print Doesn't match any programming language
	 */
	
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   if(language.equals("Java")){
			   System.out.println("ava is a programming language");
		   } else if(language.equals("C")){
			   System.out.println("C is a procedural programming language");
		   }else if(language.contentEquals("C++")) {
			   System.out.println("C++ is a middle-level programming");
		   }else {
			   System.out.println("Doesn't match any programming language");
		   }
		  
		  }
}
