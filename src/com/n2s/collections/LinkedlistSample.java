package com.n2s.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedlistSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("janani");
		list.add("priya");
		list.add("kongu");
		list.add("varsha");
		list.add("janani");
		// System.out.println(list);
		/*
		 * Iterator<String> it = list.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------------");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
