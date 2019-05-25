package HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HM165 {
	/*
	 * How do you replace a value associated with a given key in the HashMap?
	 * 
	 * add the follow values map.put("ONE","AAA"); map.put("TWO","BBB");
	 * map.put("THREE","CCC"); map.put("FOUR","DDD"); map.put("FIVE","EEE"); print
	 * the key and values pairs
	 * 
	 * replace with below key THREE--> ASEL and key FIVE-->SUMAIR
	 * 
	 * PRINT THE VALUES AFTER REPLACING
	 * 
	 * OUTPUT
	 * 
	 * HashMap Before Replace : FIVE : EEE ONE : AAA FOUR : DDD TWO : BBB THREE :
	 * CCC ------------------ HashMap After Replace : FIVE : SUMAIR ONE : AAA FOUR :
	 * DDD TWO : BBB THREE : ASEL
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		System.out.println("HashMap Before Replace :");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		map.replace("FIVE", "SUMAIR");
		map.replace("THREE", "ASEL");
		System.out.println("HashMap After Replace :");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}