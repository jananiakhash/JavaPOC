package com.n2s.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		set.add("janani");
		set.add("priya");
		set.add("kongu");
		set.add("varsha");
		set.add("janani");
		// System.out.println(list);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
