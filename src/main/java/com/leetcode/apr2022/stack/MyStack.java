package com.leetcode.apr2022.stack;

public class MyStack {
	int size;
	int[] arr;
	int tail = 0;
	int length = 0;

	public MyStack(int size) {
		this.size = size;
		this.arr = new int[size];
	}

	public void push(int i) {
		if (length == size)
			return;
		arr[tail] = i;
		tail++;
		length++;
	}

	public int pop() {
		if (length == 0)
			return -1;
		int temp = arr[tail - 1];
		arr[tail - 1] = 0;
		length--;
		tail--;
		return temp;
	}

	public int peek() {
		if (length == 0) 
			return -1;
	     int temp = arr[tail - 1];
			return temp;
		}
	
	

	public boolean isEmpty() {
		if(length==0) {
			return true;
		}else {
			return false;
		}
	}

	public int length() {
		return length;
	}

}
