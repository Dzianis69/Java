import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d, e, f;
		Scanner input = new Scanner(System.in);
		System.out.println("First number");
		d = input.nextInt();
		System.out.println("Second number");
		e = input.nextInt();
		System.out.println("Third number");
		f = input.nextInt();

		if (d > e) {
			if (d > f) {
				System.out.println("The largest number is " + d);

			} else {
				System.out.println("The largest number is " + f);
			}
		} else if (e > f) {
			if (e > d) {
				System.out.println("The largest number is " + e);
			} else {
				System.out.println("The largest number is " + d);

			}
		} else {
			System.out.println("The largest number is " + f);
		}

	}
}
