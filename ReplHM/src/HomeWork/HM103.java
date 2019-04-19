package HomeWork;

/*
 * For you to do 

create two methods
create first instance method write the logic in it as 
Programming is amazing. in println statement
create second static method write the logic in it as 
Java is awesome. in println statement

call this two method in main method

Output:
Programming is amazing.
Java is awesome.
 */
public class HM103 {
public void met() {
	System.out.println("Programming is amazing.");
}
public static void met1() {
	System.out.println("Java is awesome.");
}
public static void main(String[] args) {
	HM103 obj = new HM103();
	obj.met();
	met1();
	
}
}
