package ReviewClass;

public class ChildSuper extends MainSuper {
	public static void main(String[] args) {
		ChildSuper obj = new ChildSuper("Hello World", "YO");
		ChildSuper obj1 = new ChildSuper("YO");
	}

	ChildSuper(String a) {
		super(a);
		System.out.println("This is parent with 1 parameter");
	}

	ChildSuper(String a, String b) {
		super(a, b);
		System.out.println("This is parent with 2 parameter");
	}
}
