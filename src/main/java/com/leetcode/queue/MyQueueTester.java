package com.leetcode.queue;

public class MyQueueTester {
	
	
	public static  void main(String[] args) {
		MyQueue queue =new MyQueue(5);
		queue.enQueue(300);
		queue.enQueue(100);
		queue.enQueue(200);
		queue.enQueue(300);
		queue.enQueue(400);
		queue.remove();
		queue.remove();
		queue.peek();
	

		
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.length());
		System.out.println(queue.peek());
		
		
	}

}
