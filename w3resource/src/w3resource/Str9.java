package w3resource;

public abstract class Str9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*9. Write a Java program to compare a given string to the specified character sequence. Go to the editor

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false*/
		String str="example.com";
		String str1="example.com";
		String str2="Example.com";
		String str3="example.com";
		
		System.out.println(str.equals(str1));
		System.out.println(str2.equals(str3));
	}

}
