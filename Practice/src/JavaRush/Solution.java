package JavaRush;

/*
 * Write method compare (int a )so that it: 
- displays the string " Number less than 5 ", if the method parameter is less than 5 , 
- displays the string " Number greater than 5 " if the method parameter is greater than 5 , 
- displays the string " Number equals 5 " if the method parameter equals 5 .

Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print.
•	The main method must call the compare method.
•	The compare method must be void.
•	The compare method should display text on the screen according to the task.
 */
public class Solution {
	 public static void main(String[] args) {
	        displayClosestToTen(8, 11);
	        displayClosestToTen(7, 14);
	    }

	    public static void displayClosestToTen(int a, int b) {
	        // напишите тут ваш код
	if(a.abs()) {
		
	}
	    }

	    public static int abs(int a) {
	        if (a < 0) {
	            return -a;
	        } else {
	            return a;
	        }
	    }
	}

/*	public static void main(String[] args) {
	
	    compare(3);
	    compare(6);
		compare(5);
	}

	/*public static void compare(int a) {
		// напишите тут ваш код
		if (a < 5) {
			System.out.println("\"Число меньше 5\"");
		} else if (a > 5) {
			System.out.println("\"Число больше 5\"");
		} else {
			System.out.println("\"Число равно 5\"");
		}
	}
}*?
public static void compare(int a) {
    //напишите тут ваш код
    if (a < 5)
    System.out.println("\"Число меньше 5\"");
        else if (a <= 5)
    {
        System.out.println("\"Число больше 5\"");
        System.out.println("\"Число равно 5\"");
    }
}
}*/