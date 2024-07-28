package n2s.ehc.janani;

import java.util.Scanner;

import n2s.ehc.janani.UserExceptions.InValidEntry;
import n2s.ehc.janani.UserExceptions.InValidUserId;
import n2s.ehc.janani.UserExceptions.UserIdNotFound;

public class UserMain {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws InValidEntry {
		while (true) {

			System.out.println("Choose the option below");
			System.out.println("**********************");
			System.out.println("1 - Insert");
			System.out.println("2 - Update");
			System.out.println("3 - Delete");
			System.out.println("4 - view");
			System.out.println("5 - Exit");
			System.out.println("Enter your option value");

			UserBean userbean = new UserBean();
			userbean.setOptionValue(Integer.parseInt(s.nextLine()));
			int option = userbean.getOptionValue();

			switch (option) {

			case 1:

				do {
					insertValue();
					System.out.println("Wish to Insert more (y/n):");

				} while (s.nextLine().equalsIgnoreCase("y"));
				break;

			case 2:

				do {
					updateValue();
					System.out.println("Wish to update more (y/n):");

				} while (s.nextLine().equalsIgnoreCase("y"));
				break;

			case 3:
				do {
					deleteValue();
					System.out.println("Wish to update more (y/n):");

				} while (s.nextLine().equalsIgnoreCase("y"));
				break;

			case 4:

				UserOptions userOptions = new UserOptions();
				userOptions.view();

				break;

			case 5:

				System.out.println("Ending the flow. Thank you!!!");
				s.close();
				break;

			default:
				throw new InValidEntry("Invalid Option Selected");
			}

		}

	}

	private static void deleteValue() {

		UserOptions userOptions = new UserOptions();
		UserBean userbean = new UserBean();

		System.out.println("Enter UserId:");
		userbean.setUserId(Integer.parseInt(s.nextLine()));

		try {
			userOptions.delete(userbean.getUserId());
		} catch (UserIdNotFound e) {
			e.printStackTrace();
		}

	}

	private static void updateValue() {

		UserOptions userOptions = new UserOptions();
		UserBean userbean = new UserBean();

		System.out.println("Enter UserId:");
		userbean.setUserId(Integer.parseInt(s.nextLine()));

		System.out.println("Enter Username:");
		userbean.setName(s.nextLine());

		try {
			userOptions.update(userbean.getUserId(), userbean.getName());
		} catch (UserIdNotFound e) {
			e.printStackTrace();
		}

	}

	private static void insertValue() {

		UserOptions userOptions = new UserOptions();
		UserBean userbean = new UserBean();

		System.out.println("Enter UserId:");
		userbean.setUserId(Integer.parseInt(s.nextLine()));

		System.out.println("Enter Username:");
		userbean.setName(s.nextLine());

		try {
			userOptions.insert(userbean.getUserId(), userbean.getName());
		} catch (InValidUserId e) {
			e.printStackTrace();
		}

	}
}
