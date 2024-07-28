package com.n2s.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("janani");
		list.add("priya");
		list.add("kongu");
		list.add("varsha");
		list.add("janani");
		// System.out.println(list);
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
