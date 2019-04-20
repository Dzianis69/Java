package HomeWork;

/*
 * Create the two final method with same name but different parameters and try to call them in main method
create one method with boolean parameter
create another method with String parameter
output would 

Final method with boolean parameter
Final method with String parameter
 */
public class HM124 {
final static void  met(boolean v) {
System.out.println("Final method with boolean parameter");
}
final static void  met(String s) {
System.out.println("Final method with String parameter");
}
public static void main(String[] args) {
	met(true);
	met("Syntax");
}
}
