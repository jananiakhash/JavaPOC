package com.n2s.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
		dq.offer("Janani");
		dq.offer("PRIYA");
		dq.add("varsha");
		dq.offerFirst("kongu");
		for (String s : dq) {
			System.out.println(s);
		}
		System.out.println("------------");
		dq.pollLast();
		for (String s : dq) {
			System.out.println(s);
		}
	}

}
