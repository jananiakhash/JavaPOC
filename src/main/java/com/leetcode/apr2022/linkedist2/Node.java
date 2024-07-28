package com.leetcode.apr2022.linkedist2;

public class Node {

	private int value;
	private Node next;

	public Node(int val) {
		this.value = val;
	}
	
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	public int getVal() {
		return value;
	}

	public void setVal(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
