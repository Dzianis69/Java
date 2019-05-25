package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		/*
		 * Create 3 objects of the sub classes and store them in ArrayList. Using 1
		 * reference variable access methods from different classes.
		 */
		Insurance obj1 = new Car("BMW");
		Insurance obj2 = new Pet("Cat");
		Insurance obj3 = new Health("HealthInsurance");

		ArrayList<Insurance> alist = new ArrayList<Insurance>();
		alist.add(obj1);
		alist.add(obj2);
		alist.add(obj3);
		for (Insurance obj : alist) {
		obj.getQuote();
		obj.cancelInsurance();
		}
		System.out.println("-----------------");

		Iterator<Insurance> iterator = alist.iterator();
		while (iterator.hasNext()) {
			Insurance obj = iterator.next();
			obj.getQuote();
			obj.cancelInsurance();
		}
		System.out.println("-------------------");

 for(int i = 0; i < alist.size(); i++) {
	Insurance obj = alist.get(i);
	obj.cancelInsurance();
	obj.getQuote();
 }
	}

}
