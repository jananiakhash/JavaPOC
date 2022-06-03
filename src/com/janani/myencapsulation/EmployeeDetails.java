package com.janani.myencapsulation;

public class EmployeeDetails {

	private String emp_fname, emp_lname, emp_address;
	private int emp_age;
	private long emp_phone_number;

	public void setFname(String fname) {
		this.emp_fname = fname;
	}

	public void setLname(String lname) {
		this.emp_lname = lname;
	}

	public void setAddress(String address) {
		this.emp_address = address;
	}

	public void setPhone_number(long phone_number) {
		this.emp_phone_number = phone_number;
	}

	public void setAge(int age) {
		this.emp_age = age;
	}

	public String getFname() {
		return emp_fname;
	}

	public String getLname() {
		return emp_lname;
	}

	public String getAddress() {
		return emp_address;
	}

	public int getAge() {
		return emp_age;
	}

	public long getPhone_number() {
		return emp_phone_number;
	}

}
