import java.util.Scanner;

public class IfTask1 {
	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 * * Allow user to enter grade and then provide explanation: A-
		 Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 * 
		 * HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user
		 */
		
		String country,lung;
		Scanner input =new Scanner(System.in);
		System.out.println("What is your country?");
		country=input.nextLine();
		 
		if(country.equals("USA")) {
			lung= "English";
			
			
		}else if(country.equals("Brazil")) {
			lung="Portugesee";
		}else if(country.equals("Belarus")) {
		lung= "Belarusian";
		}else if(country.equals("Peru")) {
			lung=" Spanish";
		}else if(country.equals("Italy")) {
			lung=" Italian";
		}else if(country.equals("France")) {
	lung=" French";
		}else if(country.equals("Germany")) {
			lung="German";
		}else {
			lung="Your language unknown";
		}
		
		System.out.println("Your country is "+country+" and your lunguage is "+lung);
	}
}
