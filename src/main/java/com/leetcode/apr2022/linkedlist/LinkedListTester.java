package com.leetcode.apr2022.linkedlist;

public class LinkedListTester {
	
	 public static void main(String[] args){
		 LinkedListImplementation myLinkedList = new LinkedListImplementation(5);
	        System.out.println("isEmpty(expected = true) ::"+myLinkedList.isEmpty());
	        myLinkedList.add(100);
	        myLinkedList.add(200);
	        System.out.println("isEmpty(expected = false) ::"+myLinkedList.isEmpty());
	        myLinkedList.add(300);
	        System.out.println("Size (expected = 3) :: "+myLinkedList.size());
	        myLinkedList.remove(200);
	        System.out.println("Size (expected = 2) :: "+myLinkedList.size());
	        myLinkedList.add(400);
	        myLinkedList.add(500);
	        System.out.println("Size (expected = 4) :: "+myLinkedList.size());
	        System.out.println("isEmpty(expected = false) ::"+myLinkedList.isEmpty());
	        myLinkedList.clear();
	        System.out.println("isEmpty(expected = true) ::"+myLinkedList.isEmpty());
	        System.out.println("Size (expected = 0) :: "+myLinkedList.size());
	    }

}
