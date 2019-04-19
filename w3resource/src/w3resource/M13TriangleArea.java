package w3resource;

import java.util.Scanner;

/*
 * 13. Write Java methods to calculate the area of a triangle. Go to the editor
Expected Output:
Input Side-1: 10                                                                               
Input Side-2: 15                                                                               
Input Side-3: 20                                                                              
The area of the triangle is 72.6184377413890
 */
public class M13TriangleArea {
	public static void main(String[] args) throws Exception {
        //напишите тут ваш код
Scanner in = new Scanner(System.in);
int a = in.nextInt();
if(a > 0) System.out.println(a*2);
if(a < 0) System.out.println(a+1);
if(a == 0) System.out.println(a);
    }

}

