package EXAMQ;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* . Write a Java Program to find whether a String is palindrome or not? */
		String word2="";
		Scanner in=new Scanner(System.in);
		System.out.println("Type a word");
		String word=in.nextLine();
		for(int i=word.length()-1;i>=0;i--) {
		word2+=word.charAt(i);
		}
		if(word.equalsIgnoreCase(word2)){
			System.out.println(word+" is palindrome");
		}else {
			System.out.println(word+" is not ");
		}
	}
}
