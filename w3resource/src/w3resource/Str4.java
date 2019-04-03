package w3resource;

public class Str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Write a java program to count a number of Unicode code points in the
		 * specified text range of a String. Go to the editor
		 * 
		 * Sample Output:
		 * 
		 * Original String : w3rsource.com Codepoint count = 9
		 */
		String str="w3rsource.com";  
		System.out.println("Code point count="+str.codePointCount(1,10));
	}
}

