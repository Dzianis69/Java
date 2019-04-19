package HomeWork;

/*
 * 1. Create four classes (Person, Employee, Student, Retiree)

* Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)

* have a print method in each that prints the properties in line as shown in the output

Use your inheritance skills to make Person as your parent class and 

From your Main class create objects of the Employee, Student and Retiree classes 
and print out their properties in the following order.


Output: 
 
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
 */
public class HM116Testing {
	public static void main(String[] args) {

		Emloyee1 obj1 = new Emloyee1();
		obj1.name = "Joe";
		obj1.lastName = "Smith ";
		obj1.age = 35;
		obj1.salary= 35000;
		obj1.getEmployee(obj1.name, obj1.lastName, obj1.age, obj1.salary);
		 Student obj2 = new Student();
		 obj2.name = "Adam";
		 obj2.lastName = "Smith";
		 obj2.age = 15;
		 obj2.grade = 10;
		 obj2.getstudent(obj2.name, obj2.lastName, obj2.age, obj2.grade);
		 Retiree obj3 = new Retiree();
		 obj3.name = "Frank";
		 obj3.lastName = "Smith";
		 obj3.age = 15;
		 obj3.seniorActivity = "tour";
		 obj3.getRetiree(obj3.name, obj3.lastName, obj3.age, obj3.seniorActivity);
		 
	}
}