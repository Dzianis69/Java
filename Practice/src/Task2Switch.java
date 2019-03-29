import java.util.Scanner;

public class Task2Switch {
	public static void main(String[] args) {

		char grade;
		String expl;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your grade?");
		grade = input.next().charAt(0);
		switch (grade) {

		case 'A':
			expl = "Exellent";
			break;
		case 'B':
			expl = "Good";
			break;
		case 'C':
			expl = "Average";
			break;
		case 'D':
			expl = "Bad";
			break;
		default:
expl="Not Accepteble";
		}
		
		System.out.println("Your grade is "+grade+" and it is "+expl+".");
	}
}
