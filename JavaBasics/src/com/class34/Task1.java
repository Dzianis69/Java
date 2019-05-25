package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
	public static void main(String[] args) {
		String[] cities = { "Mensk", "Odessa", "Oslo", "Dublin", "Riga", "LA" };

		Map<String, Integer> cityMap = new LinkedHashMap<>();

		for (String city : cities) {
			cityMap.put(city, city.length());
			Iterator<Map.Entry<String, Integer>> it = cityMap.entrySet().iterator();
			while (it.hasNext()) {
				int a = it.next().getValue();
				if (a > 7) {
					it.remove();
				}
			}
		}
		System.out.println(cityMap);
		
	}
}