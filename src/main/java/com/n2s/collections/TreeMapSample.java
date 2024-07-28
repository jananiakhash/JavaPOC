package com.n2s.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(110, "janani");
		hm.put(105, "varsha");
		hm.put(100, null);
		hm.put(75, "indhu");
		hm.put(85, null);
		// hm.put(null, "vijay");
		hm.put(150, null);
		// hm.put(null, "Arasu");

		for (Map.Entry<Integer, String> me : hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

}
