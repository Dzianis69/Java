package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList
 */
public class Task4 {
	public static void main(String[] args) {
		ArrayList<Integer> in = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				in.add(i);

			}
		}

		System.out.println(in);

		Iterator<Integer> it = in.iterator();
		while (it.hasNext()) {
			if (it.next() % 5 == 0) {
				it.remove();
			}

		}
		System.out.println(in);
	}
}
