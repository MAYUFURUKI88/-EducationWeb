package practice3.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practice3Servlet")
public class Practice3Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Practice3Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date date = new Date();
		int byou = date.getSeconds();

		if ((byou % 2) == 0) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/practice3.jsp");
			rd.forward(request, response);
			return;
		}

		response.sendRedirect("/EducationWeb/Practice3RedirectServlet");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
