package com.class20;

/*
 * Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.

Create a method that will take a String and return whether String is palindrome or not. Method should available to all classes within your projects.

Create a method that will take a string and return array of words from that string. Method should be available only within same class.
 */
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task3 obj = new Task3();

		String[] array = obj.getWords("Whatever hapens it is for reason");
		for (String a : array) {
			System.out.println(a);
		}
		String reverse = obj.getReverse("Goalaziiiio");
		System.out.println(reverse);
		System.out.println(obj.getPalindrome("lol"));
	}

	// TODO Auto-generated method stub

	String getReverse(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}

	public boolean getPalindrome(String s) {
		boolean flag = false;
		String palindrome = getReverse(s);

		if (palindrome.equalsIgnoreCase(s)) {
			flag = true;
			System.out.print(palindrome + " is  palidrome ");
		} else {
			System.out.print(palindrome + " is  palidrome ");

		}

		return flag;

	}

	private String[] getWords(String words) {
		String[] array = words.split(" ");
		return array;

	}
}
/*
 * public class AccessModifiers {
    public static void main(String[] args) {
        
        AccessModifiers obj=new AccessModifiers();
        String reversed=obj.reverseString("Hello");
        System.out.println(reversed);
        
        boolean isPalindrome=obj.isPalindrome("hello");
        System.out.println(isPalindrome);
        
        String[] array=obj.getWordsFromString("Have a good night students");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------------------------");
        for (String word:array) {
            System.out.println(word);
        }
        
    }
    /*Create a method that will take 1 parameter as a String 
     * and return reversed String.
     *  Method should be visibly only within same package
    protected String reverseString(String str) {
        String reversed="";
         for (int i =str.length()-1; i>=0; i--) {
             reversed=reversed+str.charAt(i);
         }
        return reversed;
    }
    /* Create a method that will take a String and 
     * return whether String is palindrome or not. 
     * Method should be available to all classes within your projects.
     
    public boolean isPalindrome(String str) {
        boolean flag=false;
        String reversed=reverseString(str);
        if (reversed.equalsIgnoreCase(str)) {
            flag= true;
        }
        return flag;
    }
    /*Create a method that will take a string and 
     * return an array of words from that string. 
     * Method should be available only within same class.
     
    
    private String[] getWordsFromString(String str) {
        String[] words=str.split(" ");
        return words;
    }
}
 */
