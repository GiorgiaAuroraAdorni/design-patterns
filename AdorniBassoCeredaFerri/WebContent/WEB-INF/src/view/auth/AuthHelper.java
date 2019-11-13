package view.auth;

import model.auth.User;
import model.auth.User.Role;

public class AuthHelper {

	private User user;
	
	public AuthHelper(User user) {
		this.user = user;
	}

	public String getUsername() {		
		return (this.user != null) ? this.user.getUsername() : null;
	}
	
	public boolean isAdmin() {	
		return (this.user != null) && (this.user.getRole() == Role.ADMIN);
	}
}
