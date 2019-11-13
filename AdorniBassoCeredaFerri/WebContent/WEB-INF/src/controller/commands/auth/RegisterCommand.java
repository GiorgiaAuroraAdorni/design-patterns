package controller.commands.auth;

import controller.commands.AbstractCommand;
import controller.commands.IOException;

public class RegisterCommand extends AbstractCommand {

	@Override
	public void processGet() throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void processPost() throws IOException {
		response.sendRedirect("/AdorniBassoCeredaFerri/");		
	}
}
