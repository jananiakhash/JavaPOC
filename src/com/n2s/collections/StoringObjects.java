package com.n2s.collections;

import java.util.ArrayList;
import java.util.List;

import com.n2s.myApplication.Sample;

public class StoringObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		List<Sample> slist = new ArrayList<Sample>();
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		System.out.println(slist);

	}
}
