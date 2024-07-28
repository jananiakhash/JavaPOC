package com.leetcode.apr2022.linkedist2;

public class LL2Tester {

	public static void main(String[] args) {
		
		LinkedList1 list = new LinkedList1();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		System.out.println(list.length());
		list.print();
		
		list=reverseLinkedList(list);

	}

	private static LinkedList1 reverseLinkedList(LinkedList1 list) {
		return list;
	}
	
	
}
