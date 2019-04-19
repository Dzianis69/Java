package w3resource;

import java.util.Scanner;

/*3.Write a Java method to check whether a string is a valid password.
Password rules:A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits
*/
public class Method10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Set password");
		String password = in.nextLine();
		checkPassword(password);

	}

	public static void checkPassword(String password) {
		int count = 0;
		if (password.length() < 10)
			System.out.println("Password to short");
		if (!(password.equals(password.replaceAll("[^A-Z a-z0-9]", ""))))
			System.out.println("Password shoud contain only letters and didigits");
		else {
			char[] check = password.toCharArray();
	for(int i= 0 ; i < check.length;i++) {
	if(check[i] =='0' || check[i] =='1' || check[i] =='2' 
			|| check[i] =='3' || check[i] =='4' || check[i] =='5' 
			|| check[i] =='6' || check[i] =='7' || check[i] =='8' 
			|| check[i] =='9') {
		count++;
	}
	
	}
	if(count<2) System.out.println("Password should have at least 2 digits");
	else	System.out.println("your password is good");
		}
	}
}
