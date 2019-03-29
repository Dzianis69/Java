import java.util.Scanner;

public class HM61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Prompt user with question: "Is it weekend?" if it is not a weekend -->
		 * subject="Manual testing" Otherwise --> subject="Java"
		 * 
		 * Output of the program should be: "Today you will be learning ____"
		 */
		
		String subject;
		boolean bool;
		Scanner input=new Scanner(System.in);
		System.out.println("Is it weekend?");
		bool=input.nextBoolean();
		if(!bool) {
			subject="Manual testing";
		}else {
			subject="Java";
		}
		System.out.println("Today you will be learning "+subject);
	}

}
