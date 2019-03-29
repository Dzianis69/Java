import java.util.Scanner;

public class HM74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create main Method!!!!!!!! Scanner Class and Switch case is needed for this
		 * Assignment
		 * 
		 * Write a program to input number "Input a number between 1-12" and when you
		 * input a number it should display the month using Scanner and Switch
		 * statement.
		 * 
		 * case: 1 will display January
		 * 
		 * case: 12 will display December
		 * 
		 * Anything outside of 12 will display "Invalid"
		 */
		String name;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number between 1-12");
		num = input.nextInt();
		switch (num) {
		case 1:
			name = "January";
			;
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		default:
			name = "Invalid";

		}
		System.out.println(name);
	}

}
