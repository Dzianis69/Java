package inheritance;

public class Child {
public Child() {
	System.out.println("I am from Child class");
}
public Child(String str) {
	System.out.println("Are you real? "+str);
}
public static void main(String[] args) {
	Child obj = new Child();
	Child obj1 = new Child("Yes");
}

}
