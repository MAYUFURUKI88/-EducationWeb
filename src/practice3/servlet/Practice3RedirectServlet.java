package practice3.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practice3RedirectServlet")
public class Practice3RedirectServlet extends HttpServlet {
	private static final long seriaVersinUID = 1L;

	public Practice3RedirectServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//HTML出力

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>リダイレクトされました</p>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletResponse response, HttpServletRequest request)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
