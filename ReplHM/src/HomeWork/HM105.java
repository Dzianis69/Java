package HomeWork;

/*
 * For you to do

Create method and create the logic to increment the count value as count++
and in main method create the three objects and call the method with three different object you created and print count value.

Output:
3
3
3

 */
public class HM105 {
	static int count = 0;

	public static void main(String[] args) {
		HM105 obj1 = new HM105();
		count++;
		HM105 obj2 = new HM105();
		count++;
		HM105 obj3 = new HM105();
		count++;
		obj1.getPrint(count);
		obj2.getPrint(count);
		obj3.getPrint(count);
		
	}

	public  void getPrint(int c) {
		System.out.println(c);
	}
}
