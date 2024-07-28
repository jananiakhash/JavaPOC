package com.leetcode.apr2022.linkedist2;

public class LinkedList1 {
	private Node head = null;
	private Node tail = null;

	public LinkedList1() {
		
	}

	public void insert(int val) {
		Node newNode = new Node(val);

		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
//			Node current = this.head;
//			while (current.getNext() != null) {
//				current = current.getNext();
//			}
//			current.setNext(newNode);
		}
	}

	public boolean remove(int val) {
		Node current = this.head;
		Node prev = null;

		if (current == null) {
			return false;
		}

		while (current != null) {
			if (current.getVal() == val) { // found node to be deleted
				if (current == this.head) {

					current = current.getNext();
					this.head = current;
					System.out.println(current.getVal());
					return true;
				} else if (current.getNext() == null) {
					prev.setNext(null);
					current = prev;
					System.out.println(current);
					return true;

				} else {
					prev.setNext(current.getNext());
					System.out.println(current);
					return true;
				}

			} else { // not found - go to next node
				prev = current;
				current = current.getNext();

			}
		}

		return false;
	}

	public Node getLastNode() {
		Node current = this.head;

		if (current == null) {
			return null;
		}

		while (current.getNext() != null) {
			current = current.getNext();
		}

		return current;
	}

	public Node find(int val) {
		Node current = this.head;

		if (current == null) {
			return null;
		}

		while (current.getNext() != null) {
			if (current.getVal() == val) {
				return current;
			}
			current = current.getNext();
		}

		return null;
	}

	public void print() {
		Node current = this.head;

		while (current != null) {
			System.out.print(current.getVal() + " ");
			current = current.getNext();
		}
	}

	public int length() {
		int count = 0;
		Node current = this.head;

		while (current != null) {
			count++;
			current = current.getNext();
		}

		return count;
	}

	public Node getHead() {
		return this.head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	

}
