package com.leetcode.queue;

public class UserExceptions {

	public static class NoMemoryToStoreData  extends Exception {

		public NoMemoryToStoreData(String msg) {
			super(msg);
		}

	}

	public static class UserIdNotFound extends Exception {
		public UserIdNotFound(String msg) {
			super(msg);
		}

	}

	public static class InValidEntry extends Exception {

		public InValidEntry(String msg) {
			super(msg);
		}

	}
}
