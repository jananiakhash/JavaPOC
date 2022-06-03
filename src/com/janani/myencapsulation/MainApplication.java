package com.janani.myencapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<EmployeeDetails> dlist = new ArrayList<EmployeeDetails>();

		do {

			System.out.println("Enter your first name");
			String fname = input.nextLine();

			System.out.println("Enter your last name");
			String lname = input.nextLine();

			System.out.println("Enter your address ");
			String address = input.nextLine();

			System.out.println("Enter your phonenumber");
			long phonenumber = Long.parseLong(input.nextLine());

			System.out.println("Enter your age");
			int age = Integer.parseInt(input.nextLine());

			EmployeeDetails details = new EmployeeDetails();

			details.setFname(fname);
			details.setLname(lname);
			details.setAddress(address);
			details.setPhone_number(phonenumber);
			details.setAge(age);
			dlist.add(details);
			System.out.println("Do you wish to continue;{Y/N}");

		} while (input.nextLine().equalsIgnoreCase("Y"));

		input.close();

		for (int i = 0; i < dlist.size(); i++) {
			System.out.println("" + dlist.get(i).getFname());
			System.out.println("" + dlist.get(i).getLname());
			System.out.println("" + dlist.get(i).getAddress());
			System.out.println("" + dlist.get(i).getPhone_number());
			System.out.println("" + dlist.get(i).getAge());

		}

	}
}
