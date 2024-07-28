package com.n2s.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQSample {
// it doesn't maintain the order since it inherits abstract queue class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("priya");
		pq.add("janani");
		pq.add("kongu");
		pq.add("varsha");
		pq.add("indhu");

		System.out.println("head:" + pq.element());// throws nosuchelement exception if queue is empty
		System.out.println("head:" + pq.peek()); // returns null if queue is empty

		Iterator<String> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------");

		pq.remove();// throws exception
		pq.poll();// returns null if queue is empty
		Iterator<String> it1 = pq.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
