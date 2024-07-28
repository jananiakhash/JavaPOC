package com.leetcode.apr2022.comoarablevsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExplained {
	
	public static void main(String[] args) {
		
	List<Student> list= new ArrayList<Student>();
	list.add(new Student(2,"Janani",99));
	list.add(new Student(1,"Akhash",80));
	list.add(new Student(6,"Diya",98));
	
	
	  Comparator<Student> com= new Comparator<Student>(){
	  
	  @Override
	  public int compare(Student o1, Student o2) {
	  
	  if(o1.getId()>o2.getId())
		  return 1;
	  else return -1;
	  
	  }
	  
	  };
	 
		
		Collections.sort(list,com);
		for(Student s:list) {
			System.out.println(s);
		}
		
		
		
	}

}
