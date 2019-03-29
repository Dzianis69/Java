import java.util.Scanner;

public class Task3Switch {
	public static void main(String[] args) {
		char oper;
		double a, b, c;
		c = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Type number one");
		a = input.nextDouble();
		System.out.println("Type second number");
		b = input.nextDouble();
		System.out.println("what operation would you like to perform");
		oper = input.next().charAt(0);
		switch (oper) {
		case '+':
			c = a + b;
			break;
		case '_':
			c = a - b;
			break;
		case '/':
			c = a / b;
			break;
		case '*':
			c = a * b;
			break;
		default:
			System.out.println("Type corect operator");
		}
		System.out.println("The operation between " + a + " and " + b + " is " + c + ".");
	}
}
