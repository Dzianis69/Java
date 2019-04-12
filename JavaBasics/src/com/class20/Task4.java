package com.class20;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * /*Create a method that will take 1 parameter as a String 
     * and return reversed String.
     *  Method should be visibly only within same package
 */
		Task4 obj = new Task4();
		String reversed = obj.getReversed("GoodJob");
		System.out.println(reversed);
		boolean palindrome = obj.getPalindrome("lol");
		System.out.println(palindrome);
		String [] array = obj.getWords("Good morning mister Dzianis !!!");
		for(String words : array) {
			System.out.println(words);
		}
	}
String getReversed(String str) {
	String reversed="";
	for(int i=str.length()-1;i>=0;i--) {
		reversed +=str.substring(i,i+1);
	}
	return reversed;
}

/*
 * Create a method that will take a String and 
     * return whether String is palindrome or not. 
     * Method should be available to all classes within your projects.
 */

public boolean getPalindrome(String str) {
	String reversed = getReversed(str);
	boolean flag = false;
	if(str.equalsIgnoreCase(reversed)) {
		System.out.print(str+" -is palindrome and that is ");
		flag =true;	
	}else {
		System.out.print(str+" -is not palindrome and it is ");
	}
	return flag;
}
/*
 * Create a method that will take a string and 
     * return an array of words from that string. 
     * Method should be available only within same class.
 */

private String [] getWords(String str) {
	String [] array = str.split(" ");
	return array ;
}
}
