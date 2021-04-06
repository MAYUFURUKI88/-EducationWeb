package web8syoumatu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpServlet8syoumatu")
public class EmpServlet8syoumatu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpServlet8syoumatu() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse esponse) throws ServletException, IOException {

		//フォームの入力値を受け取り
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");

		//Emp処理クラスを呼び出し
		EmpLogic8syoumatu empLogic = new EmpLogic8syoumatu();
		EmpView8syoumatu empView = empLogic.setEmpView(id);

		EmpView8syoumatu empView2 = empLogic.allEmpView();

		//リクエストスコープへ保存
		request.setAttribute("empView", empView);
		request.setAttribute("empView2", empView2);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/result8syoumatu.jsp");
		rd.forward(request, esponse);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
