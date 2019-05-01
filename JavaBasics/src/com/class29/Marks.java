package com.class29;

/*
 * 2. We have to calculate the percentage of marks obtained in 
 * three subjects (each out of 100) by student A and in four 
 * subjects (each out of 100) by student B. Create class ‘Marks’
 *  with an abstract method ‘getPercentage’. It is inherited by 
 *  classes ‘A’ and ‘B’ each having a method with the same name 
 *  which returns the percentage of the students. The constructor
 *   of student A takes the marks in three subjects as its parameters
 *    and the marks in four subjects as its parameters for student B. Test your code
 */
public abstract class Marks {
	abstract void getPrecentage();
}

class A extends Marks {
	int math, bio, geo;

	A(int math, int bio, int geo) {
		this.math = math;
		this.bio = bio;
		this.geo = geo;

	}

	@Override
	void getPrecentage() {
		System.out.println("The average % of 3 subjects is " + (this.math + this.geo + this.bio) / 3);

	}

}

class B extends Marks {
	int math, bio, geo, hist;

	B(int math, int bio, int geo, int hist) {
		this.math = math;
		this.bio = bio;
		this.geo = geo;
		this.hist = hist;

	}

	@Override
	void getPrecentage() {
		System.out.println("The average % of 4 subjects is " + (this.math + this.geo + this.bio + this.hist) / 4);

	}

}
