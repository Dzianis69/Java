package com.class33;

import java.util.*;

public class MapCountries {
	/*
	 * Create a map of countries with its capital. Print all keys and values from a
	 * country map using for each loop and iterator. Print all values from a country
	 * map using for each loop and iterator.
	 */
	public static void main(String[] args) {
		Map<String, String> world = new HashMap<>();
		world.put("Belarus", "Mensk");
		world.put("Ukraine", "Kiyev");
		world.put("Chezh", "Prague");
		world.put("USA", "Washingthon");
		world.put("Canada", "Ottawa");
		System.out.println(world.get("Belarus"));
		System.out.println(world);

		Set<String> countries = new TreeSet<>(world.keySet());
		System.out.println(countries);
		for (String countr : countries) {
			System.out.print(countr + " ");

		}
		System.out.println();
		Iterator<String> countrie = countries.iterator();
		while (countrie.hasNext()) {
			String cou = countrie.next();
			System.out.print(cou + "=" + world.get(cou) + " ");
		}
		System.out.println();
		List<String> city = new ArrayList<>(world.values());
		System.out.println(city);

		for (String cities : city) {
			System.out.print(cities + " ");
		}
		System.out.println();
		Iterator<String> capital = city.iterator();
		while (capital.hasNext()) {
			String capitals = capital.next();
			System.out.print(capitals + " ");
		}
	}
}
