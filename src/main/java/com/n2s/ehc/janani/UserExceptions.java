package n2s.ehc.janani;

public class UserExceptions {

	public static class InValidUserId extends Exception {

		public InValidUserId(String msg) {
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
