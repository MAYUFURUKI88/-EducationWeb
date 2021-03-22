package practice4.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Practice413Servlet")
public class Practice413Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Practice413Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Practice411Servlet p4 = (Practice411Servlet) session.getAttribute("p4");

		if (p4 != null) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/true.jsp");
			rd.forward(request, response);
			return;
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/false.jsp");
		rd.forward(request, response);

	}

}