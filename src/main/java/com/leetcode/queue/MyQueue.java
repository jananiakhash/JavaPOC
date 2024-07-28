package com.leetcode.queue;

public class MyQueue {
	int[] arr;
	int size, length;
	int tail = 0;
	int head = 0;

	public MyQueue(int size) {
		this.size = size;
		this.arr = new int[size];
	}

	public void enQueue(int i) {
		arr[tail] = i;
		tail++;
		length++;
			
	}

	public int remove() {
		if(length==0) {
			return 0;
		}else {
		
		int temp=arr[head];
		arr[head]=0;
		head++;
		length--;
		return temp;
		}
		

	}
	public boolean isEmpty() {
		if (length == 0) 
			return true;
	     int temp = arr[tail - 1];
			return false;
		}
	public int peek() {
		if (length == 0) 
			return -1;
	     int temp = arr[head];
			return temp;
		}

	public int length() {
		return length;
	}

}
