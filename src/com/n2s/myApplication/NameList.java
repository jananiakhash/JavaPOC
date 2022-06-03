
package com.n2s.myApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameList {

	public static void main(String[] args) { // TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		List<String> namelist = new ArrayList<String>();

		String name = "";
		// String yes_no = "";

		do {
			System.out.println("Enter your name");
			name = name + input.nextLine() + " ";
			// namelist.add(name);
			System.out.println("Do you wish to continue;{Y/N}");

		} while (input.nextLine().equalsIgnoreCase("Y"));
		/*
		 * for (String string : namelist) { System.out.println(string);
		 * 
		 * }
		 */
		/*
		 * for(int i=0;i<namelist.size();i++) {
		 * 
		 * System.out.println((i+1)+" "+namelist.get(i)); }
		 */
		String[] arrOfStr = name.split("\\s");
		for (String string : arrOfStr) {
			System.out.println(string);
		}
	}
}