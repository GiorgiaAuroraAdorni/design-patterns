package controller.commands.string;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import controller.commands.AbstractCommand;
import model.database.StringManipulator;

public class toUpperCaseCommand extends AbstractCommand {

	@Override
	public void process() throws ServletException, IOException {
		request.setAttribute("manipulator", new StringManipulator());
		sc.getRequestDispatcher("/stringPages/showResult.jsp").forward(request, response);
	}

}
