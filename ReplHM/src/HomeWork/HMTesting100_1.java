package HomeWork;
/*
 * Output:
 
null 0 null null
Syntax 4 2019 07/30/2019
 */
public class HMTesting100_1 {
public static void main(String[] args) {
	SyntaxTechnologies student1 = new SyntaxTechnologies();
	SyntaxTechnologies student2 = new SyntaxTechnologies("Syntax", 4, "2019", "07/30/2019");
	System.out.println(student1.schoolName+" "+student1.batch+" "+student1.year+" "+student1.lastDayOfClass);
	System.out.println(student2.schoolName+" "+student2.batch+" "+student2.year+" "+student2.lastDayOfClass);
}
}
