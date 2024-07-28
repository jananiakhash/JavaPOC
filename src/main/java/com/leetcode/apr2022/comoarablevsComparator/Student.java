package com.leetcode.apr2022.comoarablevsComparator;

public class Student implements Comparable<Student> {
	private int id;
	

	private String name;
	private int score;
	
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
	  @Override public int compareTo(Student o) { if(this.getScore()>o.getScore())
	  return 1; else return -1; }
	 
	

	
	
	

}
