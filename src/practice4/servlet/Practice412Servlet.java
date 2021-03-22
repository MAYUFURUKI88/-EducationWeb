package practice4.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Practice412Servlet")
public class Practice412Servlet extends HttpServlet {
	private static final long serialVersionUID =1L;

	public Practice412Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		session.removeAttribute("p4");

		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/top.jsp");
	        rd.forward(request, response);

	}

}
