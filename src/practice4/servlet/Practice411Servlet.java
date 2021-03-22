package practice4.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Practice411Servlet")
public class Practice411Servlet extends HttpServlet {
	private static final long serialVersionUID =1L;

	public Practice411Servlet() {
		super();
	}
	public Practice411Servlet(String name, int age) {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Practice411Servlet p4 = new Practice411Servlet("セッション", 10);
		session.setAttribute("p4", p4);

		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/menu.jsp");
	        rd.forward(request, response);

	}

}
