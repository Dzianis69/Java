package HomeWork;

public class HMTesting100 {
	/*
	 * null null 0 null 0 Joe Smith 12345 01/01/1970 35000
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee();
		Employee obj2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
		System.out.println(obj1.name+" "+obj1.lastName+" "+obj1.employeeId+" "+obj1.startDate+" "+obj1.salary);
		System.out.println(obj2.name+" "+obj2.lastName+" "+obj2.employeeId+" "+obj2.startDate+" "+obj2.salary);
	}

}
