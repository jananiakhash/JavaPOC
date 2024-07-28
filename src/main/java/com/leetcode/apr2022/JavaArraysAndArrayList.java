package com.leetcode.apr2022;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArraysAndArrayList {
	
	public static void main(String[] args) {
		
		
		//Arrays
		String[] frindsArray= {"janani","akhash","diya","carl","siva"};
		
		
		//ArrayList
		ArrayList<String> frindsArrayList= new ArrayList<>(Arrays.asList("divya","akhash","diya","carl","siva"));
		
		//printing out both arrays and arraylist
		
		System.out.println(frindsArray);
		System.out.println(frindsArrayList);
		
		
		System.out.println(frindsArray[0]);
		System.out.println(frindsArrayList.get(0));
		
		
		frindsArray[4]="Mark";
		frindsArrayList.set(4, "Mark");
		
		
		System.out.println(frindsArray[4]);
		System.out.println(frindsArrayList.get(4));
		
		
		frindsArray[4]="Mark";
		frindsArrayList.add(0, "San");
		System.out.println(frindsArrayList.get(0));
		System.out.println("ArrayList-----------"+frindsArrayList);
		
		System.out.print("Arrays --------");
		
		for(int i=0;i<frindsArray.length;i++) {
			System.out.println(frindsArray[i]);
		}
		frindsArray[4]="Asha";
		System.out.println("4th Element in array"+frindsArray[4]);
		
		for(int i=0;i<frindsArray.length;i++) {
			System.out.println(frindsArray[i]);			
		}
		
		frindsArrayList.remove(3);
		System.out.println(frindsArrayList);
		
		String ss="Janani";
				String  dString=String.valueOf(ss);
		System.out.println(dString);
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
	//int i =findHighestElement(arr);
	//System.out.println(i);

		
		
	}
	
	/*
	 * public static int findHighestElement(int[ ] arr){
	 * 
	 * ; for(int i=arr.length-1;i<=0;i--){ if(arr[20]!=0) { return k ; }
	 * 
	 * } return k;
	 * 
	 * 
	 * }
	 */
}
