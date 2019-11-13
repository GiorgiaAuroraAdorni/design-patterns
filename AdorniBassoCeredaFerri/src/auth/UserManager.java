package auth;

import java.util.List;

import exception.ExistingUserException;

import java.util.ArrayList;
import java.util.Arrays;

import model.auth.User;

public class UserManager {
	
	private static List<User> users = new ArrayList<User> (Arrays.<User>asList(
			new User ("mbasso", "mbassopassword", "Matteo Basso", "bassom@usi.ch", "Lugano", "Switzerland", User.Role.ADMIN),
			new User ("mferri", "mferripassword", "Marco Ferri", "ferrima@usi.ch", "Lugano", "Switzerland", User.Role.ADMIN),
			new User ("gadorni", "gadornipassword", "Giorgia Adorni", "adorng@usi.ch", "Lugano", "Switzerland", User.Role.ADMIN),
			new User ("ecereda", "eceredapassword", "Elia Cereda", "cerede@usi.ch", "Lugano", "Switzerland", User.Role.ADMIN)
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
