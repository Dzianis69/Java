package com.class21;

public class Student {
	/*
	 * 2. Create a Class called Students
	 * 
	 * Create three variables studentName , studentID and numberOfStudents Create
	 * three objects of the Students Class Set the value for studentName , studentID
	 * and increment the numberOfStudents for each object Print out total number of
	 * students
	 */
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.studentName = "John Dorian";
		student1.studentID = 69;
		Student.numberOfStudents++;
		Student student2 = new Student();
		student2.studentName = "Cris Turk";
		student2.studentID = 71;
		Student.numberOfStudents++;
        Student student3 = new Student();
        student3.studentName = "Elheot Read";
        student3.studentID = 33;
        Student.numberOfStudents++;
        
        System.out.println(Student.numberOfStudents);

		
	}

}
