package com.leetcode.apr2022.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraylistTesting {
	public static void main(String[] args) {
		
		
		  int[] arr = new int[]{1,3,3,4,5}; 
		  ArrayList<Integer> arr_new = new ArrayList<Integer>();
		  for (int i : arr) {
			  arr_new.add(i); 
			  }
		  arr_new.remove(3); 
		  System.out.println("Before deletion :" + Arrays.toString(arr));
		  System.out.println("After Deletion:" + arr_new);
		 
		
		
			/*
			 * LinkedList<Integer> list=new LinkedList<Integer>(); list.add(9); list.add(4);
			 * list.add(3); list.add(2); list.add(1); System.out.println(list); list.add(
			 * 9); System.out.println(list); list.remove(0); System.out.println(list); int
			 * r=list.get(4); System.out.println(r);
			 */
	}

}
