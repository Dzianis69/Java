package HomeWork;

import java.util.HashMap;
import java.util.Map;

public class HM166 {
	/*
	 * Create hashmap with key and values pairs add values as below map.put("mango",
	 * 10); map.put("apple", 30); map.put("orange", 20); create the method to check
	 * weather it is empty or not if it is not empty print the values and call that
	 * method in the method to check weather map is empty or not and clear the
	 * values map.clear(); and again call the method to check weather it is empty or
	 * not it should print map is empty
	 * 
	 * output
	 * 
	 * 
	 * {orange=20, apple=30, mango=10} map is empty
	 */
	public static void print(Map<String, Integer> map) {
		if (map.isEmpty()) {
			System.out.println("map is empty");
		} else {
			System.out.println(map);
		}
	}
/*
 * Create hashmap with key and values pairs  add the duplicate keys and print the values 
add values as below
map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 
map.put("mango", 40); 
 map.put("mango", 40);     

output 

{orange=50, apple=30, mango=40}
 */
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		map.put("mango", 40); 
		 map.put("mango", 40);     
		print(map);
		map.clear();
		print(map);

	}

}
