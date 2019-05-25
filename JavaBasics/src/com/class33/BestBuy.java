package com.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.
 */
public class BestBuy {
	public static void main(String[] args) {
Map<Integer, String> map = new TreeMap<>();
map.put(2461, "TV");
map.put(2460, "Laptop");
map.put(2464, "Printer");
map.put(2468, "CellPhone");
map.put(24631, "TV");
for(Map.Entry<Integer, String> name : map.entrySet()) {
	System.out.println(name.getKey()+" "+name.getValue());
}
Iterator<Map.Entry<Integer, String>> number =  map.entrySet().iterator();
while(number.hasNext()) {
	Map.Entry<Integer, String> print = number.next();
	System.out.println(print);
}
	}
}
