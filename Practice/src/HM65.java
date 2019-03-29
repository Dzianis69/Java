import java.util.Scanner;

public class HM65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?" "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=Water If user is thirsty and
		 * sleepy--> drink=Coffee If user is not thirsty and sleepy --> drink=Tea
		 * Otherwise drink="Nothing"
		 * 
		 * The output should be: "Looks like you need ___ "
		 */

		boolean bool1, bool2;
		String drink = null ;
		Scanner input = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		bool1 = input.nextBoolean();
		System.out.println("Are you sleepy?");
		bool2 = input.nextBoolean();

		if (bool1 && !bool2) {
			
			
				drink = "Water";

			

		} else if (bool1 && bool2) {
			
				drink = "Coffee";

			
		} else if (!bool1 && bool2) {
			
				drink = "Tea";

			
		} else {
			drink = "Nothing";

		
		
		
		}
		System.out.println("Looks like you need " + drink);
	}

}
