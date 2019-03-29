import java.util.Scanner;

public class SwapTwoVariables {
public static void main(String[] args) {
	//example one
	int a,b,c;
	a= 25;
	b=10;
	System.out.println("Before swaping a is equal to "+a+" and b is equal "+b);
	c=a;
	a=b;
	b=c;
	System.out.println("After swaping a is equal to  "+a+ " and b is equal to "+b);
	//example two
	int x,y;
	x= 69;
	y = 23;
	System.out.println("Before swaping : x,y are equal to "+x+" and "+y+".");
	x=y+x;
	y=x-y;
	x=x-y;
	System.out.println("After swaping : x,y are equal to "+x+" and "+y+".");
	//example three
	int d,f,g;
	Scanner in = new Scanner(System.in);
	System.out.println("Before swaping d is  equal to ");
	d = in.nextInt();
	System.out.println("Before swaping f is  equal to ");
	f=in.nextInt();
	g=d;
	d=f;
	f=g;
	System.out.println("After swaping d is  equal to "+d+" and f "+f+".");
	
	
	
}
}
