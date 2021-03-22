package practice4.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practice42Servlet")
public class Practice42Servlet extends HttpServlet {
	private static final long serialVersionUID =1L;

	public void init(ServletConfig config)throws ServletException {
		super.init(config);
		Integer count = 0;
		ServletContext application = config.getServletContext();
		application.setAttribute("count", count);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/count.jsp");
	        rd.forward(request, response);

	}

}