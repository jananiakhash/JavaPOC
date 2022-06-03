package com.n2s.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Login> ts = new TreeSet<Login>(new UnameCompare());
		ts.add(new Login("janani", "diya"));
		ts.add(new Login("priya", "diya"));
		ts.add(new Login("varsha", "diya"));
		ts.add(new Login("janani", "diya"));
		ts.add(new Login("kongu", "diya"));
		for (Login l : ts) {
			System.out.println(l);
		}

	}

}

class UnameCompare implements Comparator<Login> {

	@Override
	public int compare(Login l1, Login l2) {
		// TODO Auto-generated method stub
		return l1.getUser_name().compareTo(l2.getUser_name());
	}

}

class Login {

	private String user_name;
	private String password;

	public Login(String user_name, String password) {
		super();
		this.user_name = user_name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [user_name=" + this.user_name + ", password=" + this.password + "]";
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
