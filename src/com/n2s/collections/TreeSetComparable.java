package com.n2s.collections;

import java.util.TreeSet;

public class TreeSetComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<User> ts = new TreeSet<User>();
		ts.add(new User("janani"));
		ts.add(new User("priya"));
		ts.add(new User("janani"));
		ts.add(new User("kongu"));
		ts.add(new User("indhu"));

		for (User e : ts) {
			System.out.println(e);
		}
	}

}

class User implements Comparable<User> {

	private String user_name;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;

	}

	public User(String user_name) {
		super();
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "User [user_name=" + user_name + "]";
	}

	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		return this.user_name.compareTo(u.user_name);
	}

}