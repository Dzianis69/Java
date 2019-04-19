package HomeWork;

/*
 * For you to do 
In main class please declared the variables with different access modifiers


private int a=100;
 protected String name="SyntaxSolutions";
 float salary=565656.09f;
 public String city="Florida";


In main method please call this variables but make sure you call them in same order presented

Output:
100
SyntaxSolutions
565656.06
Florida
 */
public class HM112 {
	private int a = 100;
	protected String name = "SyntaxSolutions";
	float salary = 565656.09f;
	public String city = "Florida";

	public static void main(String[] args) {
		HM112 obj = new HM112();
		System.out.println(obj.a+"\n"+obj.name+"\n"+obj.salary+"\n"+obj.city);
		
	}
}
