package com.rapideact.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rapideact.model.Emp;

@WebServlet("/EmpServlet")

public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Empインスタンス作成
		Emp emp = new Emp("リクエスト", 99);

		//リクエストスコープにempという名前でEmpインスタンスを保存
		request.setAttribute("emp", emp);

		//セッションスコープ
		HttpSession session = request.getSession();

		//セッションスコープにempSesという名前でEmpインスタンスを保存
		Emp empSes = new Emp("セッション", 10);
		session.setAttribute("empSes", empSes);

		//リダイレクト
		response.sendRedirect("/EducationWeb/EmpServlet2");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//リクエストパラメータ取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		//Empインスタンス作成
		Emp emp = new Emp(name, Integer.parseInt(age));


		//リクエストスコープへempという名前でEmpインスタンスを保存
		request.setAttribute("emp", emp);

		//フォワード
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/result.jsp");
		rd.forward(request, response);

	}

}
