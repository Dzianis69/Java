import java.util.Scanner;

public class HM63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Prompt user to input two strings : "Please enter two strings" and two
		 * integers: "Please enter two numbers" and make the comparisons: if int1 and
		 * int2 are equal and word1 and word2 are equal, output "AND" if int1 and int2
		 * are equal or word1 and word2 are equal, output "OR" if int1 and int2 are not
		 * equal and word1 and word2 are not equal, output "NONE" Example input/output:
		 * word1: banana word2: apple int1: 2 int2: 2 OR
		 * 
		 * word1: banana word2: banana int1: 2 int2: 2 AND
		 * 
		 * word1: phone word2: pie int1: 2 int2: 3 NONE
		 */

		String word1, word2;
		int int1, int2;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two strings");
		word1 = input.nextLine();
		word2 = input.nextLine();
		System.out.println("Please enter two numbers");
		int1 = input.nextInt();
		int2 = input.nextInt();

		if (int1 == int2 && word1.equals(word2)) {

			System.out.println( word1 +  word2 +  int1 +  int2 + " AND");
		}else if(int1 == int2 || word1.equals(word2)) {
			System.out.println("word1: " + word1 + " word2: " + word2 + " int1 " + int1 + " int2: " + int2 + " OR");
		}else if(int1 != int2 && !word1.equals(word2)) {
			System.out.println("word1: " + word1 + " word2: " + word2 + " int1 " + int1 + " int2: " + int2 + " NONE");
		}
	}

}
