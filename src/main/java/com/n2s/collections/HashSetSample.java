package com.n2s.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("janani");
		set.add("priya");
		set.add("kongu");
		set.add("varsha");
		set.add("janani");
		set.add("null");
		set.add("null");

		// System.out.println(list);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
