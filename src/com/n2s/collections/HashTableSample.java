package com.n2s.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {

	public static void main(String[] args) {
		// System.out.println("Thread name :: " + Thread.currentThread().getName());

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(110, "janani");
		hm.put(105, "varsha");
		hm.put(100, "vijay");
		hm.put(75, "indhu");
		hm.put(85, "lala");
		hm.put(1, "vijay");
		hm.put(150, "shasha");
		hm.put(8, "Arasu");

		for (Map.Entry<Integer, String> me : hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());

		}

	}

	/*
	 * public void mySleep() { try { System.out.println("Sleep started...");
	 * Thread.sleep(1000); System.out.println("Sleep ended..."); } catch
	 * (InterruptedException e) { e.printStackTrace(); } }
	 */

}
