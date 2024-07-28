package com.leetcode.apr2022;

public class RemoveDuplicateCaractersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ProgrammingwehbfjlHDBLVJNGDFJBNDFA";
		removeDuplicates(str);

	}

	private static void removeDuplicates(String nums) {
		String str=nums.toLowerCase();
		
		StringBuffer sb=new StringBuffer();
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			
			boolean isreapted=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					isreapted=true;
					break;
				}
			}
			if(!isreapted) {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
				
	}

}
