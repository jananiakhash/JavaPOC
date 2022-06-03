package n2s.ehc.janani;

import java.util.HashMap;
import java.util.Map;

import n2s.ehc.janani.UserExceptions.InValidUserId;
import n2s.ehc.janani.UserExceptions.UserIdNotFound;

public class UserOptions {
	static HashMap<Integer, String> data = new HashMap<Integer, String>();

	public void insert(int id, String name) throws InValidUserId {
		if (data.containsKey(id)) {

			throw new InValidUserId("User Id already exist.Try different");

		} else {
			data.put(id, name);
			System.out.println("Your Insert success !!!");
		}

	}

	public void update(int id, String name) throws UserIdNotFound {

		if (data.containsKey(id)) {
			data.put(id, name);
			System.out.println("Your update success !!!");

		} else {
			throw new UserIdNotFound("User Id not available. Try different");
		}

	}

	public void delete(int id) throws UserIdNotFound {
		if (data.containsKey(id)) {
			data.remove(id);
			System.out.println("Delete success !!!");

		} else {
			throw new UserIdNotFound("User Id not available. Try different");
		}

	}

	public void view() {
		for (Map.Entry<Integer, String> me : data.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

	public void exit() {

	}

}
