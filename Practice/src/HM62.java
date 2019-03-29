import java.util.Scanner;

public class HM62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that prompt user with question: Do you need a loan? If the
		 * result is true then prompt user with question: What is your credit score?
		 * Otherwise eligibility = "Unknown" Based on the score define users eligibility
		 * if score is below 600 --> eligibility = "Not eligible" if score is between
		 * 600 and 700 inclusive --> eligibility = "Maybe eligible" if score is between
		 * 701 and 800 inclusive --> eligibility = "Eligible" if score is higher than
		 * any other previous values --> eligibility = "Definitely eligible" .
		 * 
		 * The output of the program should be: "The eligibility is ____"
		 */
		 String eli;
		int cs;
		boolean bool;
		Scanner input=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		bool=input.nextBoolean();
		if(bool) {
		System.out.println("What is your credidt score?");
		cs=input.nextInt();
		if(cs<600) {
			eli="Not eligible";
			System.out.println("The eligibility is "+eli);
		}else if(cs>600 && cs<=700) {
			eli="Maybe eligible";
			System.out.println("The eligibility is "+eli);
		}
		else if(cs>701 && cs<=800) {
			eli= "Eligible";
			System.out.println("The eligibility is "+eli);
		}else if(cs>800) {
			eli="Definitely eligible";
			System.out.println("The eligibility is "+eli);
		}
		
	

	}else {
		  eli="Unknown";
	
	System.out.println("The eligibility is "+eli);
	}
	}
}

	
