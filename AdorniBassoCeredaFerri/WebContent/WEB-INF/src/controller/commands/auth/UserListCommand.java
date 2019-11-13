package controller.commands.auth;

import auth.AuthManager;
import auth.UserManager;
import controller.commands.AbstractCommand;
import exception.ExistingUserException;
import model.auth.User;
import model.auth.User.Role;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;

public class UserListCommand extends AbstractCommand {

	@Override
	public void processGet() throws IOException, ServletException {
		List<User> users = UserManager
				.getShared()
				.getUsers();
		
		request.setAttribute("users", users);
		
		sc.getRequestDispatcher("/users/index.jsp").forward(request, response);
	}

	@Override
	public void processPost() throws IOException {
		throw new UnsupportedOperationException();	
	}
}
