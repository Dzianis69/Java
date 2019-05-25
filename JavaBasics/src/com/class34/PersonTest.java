package com.class34;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
	/*
	 * Create a Person class with following private fields: name, lastName, age,
	 * salary. Variables should be initialized through constructor. Inside the class
	 * also create a method to print user details. In Test Class create a Map to
	 * store personId and a Person Object. Print each object details.
	 */
	public static void main(String[] args) {

		Set<String> hset = new HashSet<String>();
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("fourth");
		hset.add("fifth");
		String[] array = new String[hset.size()];
		Iterator<String> it = hset.iterator();
		int i = 0;
		while (it.hasNext()) {
			array[i] = it.next();
			i++;
		}

		System.out.println("HashSet contains: " + hset);
		System.out.println("Array elements: ");
		for (String s : array) {
			System.out.println(s);
		}

		Map<Integer, Person> personMap = new TreeMap<>();
		personMap.put(1222, new Person("John", "Smith", 23, 54000));
		personMap.put(1223, new Person("Brad", "Nile", 33, 62200));
		personMap.put(1224, new Person("Steve", "Black", 51, 90000));
		personMap.put(1225, new Person("Amogo", "Hernandez", 42, 100000));
		personMap.put(1226, new Person("Dan", "Pan", 18, 76000));
		Collection<Person> pers = personMap.values();
		for (Person people : pers) {
			people.getInfo();
		}

	}
}
