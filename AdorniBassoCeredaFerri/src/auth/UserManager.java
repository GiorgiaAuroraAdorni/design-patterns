package auth;

import java.util.List;

import exception.ExistingUserException;

import java.util.ArrayList;
import java.util.Arrays;

import model.auth.User;

public class UserManager {
	
	private static List<User> users = new ArrayList<User> (Arrays.<User>asList(
			new User ("mbasso", "mbassopassword", "Matteo", "bassom@usi.ch", "Lugano", "Switzerland", User.Roles.ADMIN),
			new User ("mferri", "mferripassword", "Marco", "ferrim@usi.ch", "Lugano", "Switzerland", User.Roles.ADMIN),
			new User ("gadorni", "gadornipassword", "Giorgia", "adornig@usi.ch", "Lugano", "Switzerland", User.Roles.ADMIN),
			new User ("ecereda", "eceredapassword", "Elia", "ceredae@usi.ch", "Lugano", "Switzerland", User.Roles.ADMIN)
	));
	
	public static void createUser(User user) throws ExistingUserException {
		if (users.stream().anyMatch(usr -> usr.equals(user))) {
			throw new ExistingUserException();
		}
		
		users.add(user);
	}
	
	public static List<User> getUsers() {
		return users;
	}

}
