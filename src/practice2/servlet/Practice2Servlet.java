package practice2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practice2Servlet")
public class Practice2Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Practice2Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String area = request.getParameter("area");
		String sex = request.getParameter("sex");
		String check = request.getParameter("check");
		String pref = request.getParameter("pref");
		String hid = request.getParameter("hid");

		//HTML出力

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>パラメータ取得</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>テキストボックス値：" + name + "</p>");
		out.println("<p>テキストエリア値：" + area + "</p>");
		out.println("<p>ラジオボタン値：：" + sex + "</p>");
		out.println("<p>チェックボックス値：" + check + "</p>");
		out.println("<p>セレクトボックス値：" + pref + "</p>");
		out.println("<p>hidden項目値：" + hid + "</p>");
		if(Objects.equals(name, "ラピードアクト")) {
			out.println("<p>会社名：" + name + "<p>");
		}
		out.println("</bpdy>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
