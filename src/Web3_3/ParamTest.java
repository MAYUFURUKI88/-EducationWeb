package Web3_3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamTest")
public class ParamTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ParamTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//リクエストパラメーター取得
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String age = request.getParameter("age");

		//HTML出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>パラメータ取得テスト</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p1>名前：" + name + "</p1>");
		out.println("<br>");
		out.println("<p1>年齢:" + age + "</p1>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
