package HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HM164_2 {
	/*
	 * How do you check whether a particular key/value exist in a HashMap
	 * 
	 * Add the below values
	 * 
	 * 1 1.1 2 2.2 3 3.3 4 4.4 5 5.5
	 * 
	 * Check weather key 3 is there? Values 4.4? And key 6
	 * 
	 * Output
	 * 
	 * true true false }
	 */
	public static void main(String[] args) {
		Map<Integer, Double> numbers = new HashMap<>();
		numbers.put(1, 1.1);
		numbers.put(2, 2.2);
		numbers.put(3, 3.3);
		numbers.put(4, 4.4);
		numbers.put(5, 5.5);
		System.out.println(numbers.containsKey(3));
		System.out.println(numbers.containsValue(4.4));
		System.out.println(numbers.containsKey(6));

	}

}
