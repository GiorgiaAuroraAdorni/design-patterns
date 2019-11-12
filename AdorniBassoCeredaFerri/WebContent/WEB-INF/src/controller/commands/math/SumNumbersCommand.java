package controller.commands.math;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import model.math.SimpleMath;

import controller.commands.AbstractCommand;

public class SumNumbersCommand extends AbstractCommand {

	@Override
	public void process() throws ServletException, IOException {
		
		//retrieve parameters from request
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		
		//obtain reference to model object
		SimpleMath simpleMath = new SimpleMath();
		
		//send request to the model		
		double total = simpleMath.sum(a, b);
		
		//select next view
		request.setAttribute("total", total);
		
		sc.getRequestDispatcher("/mathPages/showResult.jsp").forward(request, response);	}
}
