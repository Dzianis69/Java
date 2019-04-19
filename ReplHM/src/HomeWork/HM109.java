package HomeWork;

/*
 * Just declare the variable as 
int variable;

assign the value as variable =200;

modify the value as variable= variable +200;

and print  the value 

print the value of variable of final output

Output:
400

 */
public class HM109 {
public int v = 200;
public static void main(String[] args) {
	HM109 obj = new HM109();
	obj.v += 200;
	System.out.println(obj.v);
}
}
