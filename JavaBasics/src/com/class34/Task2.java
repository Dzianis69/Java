package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {

		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("John", 70000);
		salaryMap.put("James", 80000);
		salaryMap.put("Frank", -900000);
		salaryMap.put("David", 50000);
		salaryMap.put("Jordan", -100000);

		// int maxSalary=Integer.MIN_VALUE;
		int maxSalary = 0;
		String key = null;

		for (Map.Entry<String, Integer> entry : salaryMap.entrySet()) {
			if (entry.getValue() > maxSalary) {
				maxSalary = entry.getValue();
				key = entry.getKey();
			}
		}
		System.out.println(maxSalary + " belongs to " + key);
	}
}
/*
 * public class Task2 {
 * 
 * Write a program to check which employee gets highest salary use hashmap
 * employee name as key and salary amount as the value. Output example: John
 * Smith=100000
 *
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Map<String, Integer> employMap = new HashMap<>();
 * 
 * employMap.put("John ", 83900); employMap.put("Bro", 99000);
 * employMap.put("Boss", 34000); employMap.put("Dan", 90520);
 * employMap.put("Me", 93400); System.out.println(employMap); Map<Integer,
 * String> salary = new TreeMap<>(); for (Map.Entry name : employMap.entrySet())
 * { int sal = (int) name.getValue(); String names = (String) name.getKey();
 * salary.put(sal , names); } System.out.println(salary); } }
 */
