package HomeWork;

/*
 * For you to do 
Declare two private variables in Main class as
private int batch=3
private String name="SyntaxSolutions"
declare one private method in Main class as display

create a method to return print those two values and 
 them in your main method by calling that method please print in order as shown above

Output:
3
SyntaxSolutions
 */
public class HM113 {
	private int batch = 3;
	private String name = "SyntaxSolutions";

	private void met(int a, String v) {
		System.out.println(a + "\n" + v);
	}

	public static void main(String[] args) {
		HM113 obj = new HM113();
		obj.met(obj.batch, obj.name);
	}
}
