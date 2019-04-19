package HomeWork;

/*
 * 1. Complete the SyntaxTechnologies.java class:

Include the following class variables:
* schoolName(String)
* batch(int)
* year(String)
* lastDayOfClass(String)


Write two constructors:

* default constructor
* The main constructor( with all parameters)

Create two different objects of the SyntaxTechnologies class using both constructors and print the values of the properties inline


Output:
 
null 0 null null
Syntax 4 2019 07/30/2019
 */
public class SyntaxTechnologies {
	public String schoolName;
	public int batch;
	 public String year;
	 public String lastDayOfClass;
	 
	 public SyntaxTechnologies() {
		 
	 }
 public SyntaxTechnologies(String schoolName, int bath, String year, String lastDayOfClass) {
		 this.schoolName = schoolName;
		 this.batch = bath;
		 this.year = year;
		 this.lastDayOfClass = lastDayOfClass;
	 }
}
