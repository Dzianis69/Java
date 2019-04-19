package ReviewClass;

public class Parent {
	public String a;
	public int b;
	double c;
protected Parent() {
	System.out.println("This is constractor");
	a = "Hey";
	c = 69.69;
	b = 23;

}
public static void main(String[] args) {
	Parent obj = new Parent();
	System.out.println(obj.a+"\n"+obj.c+"\n"+obj.b);
}
}
