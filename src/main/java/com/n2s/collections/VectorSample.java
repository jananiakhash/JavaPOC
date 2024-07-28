package com.n2s.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vlist = new Vector<String>();

		vlist.addElement("janani");
		vlist.addElement("priya");
		vlist.add("varsha");
		vlist.addElement("kongu");
		vlist.add("janani");
		Enumeration<String> e = vlist.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
