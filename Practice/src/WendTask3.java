import java.util.Scanner;

public class WendTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to found out the user level of experience // Must use a
		 * switch statement with a String variable named levelString and a int variable
		 * named level
		 * 
		 * // Beginner level should be 1 // Intermediate level should be 2 // Expert
		 * level should be 3
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is your level?");
	int level=input.nextInt();
		String levelString;
		switch(level) {
		case 1:
			levelString="Begineer";
			break;
		case 2:
			levelString="Intermediate";
			break;
		case 3:
			levelString="Expert";
			break;
			default:
				levelString="Good job Dzianis";
		}
		System.out.println("Your level is "+levelString);
			
	}

}
