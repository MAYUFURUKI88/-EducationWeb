package com.rapideact.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rapideact.model.logic8syou.EmpLogic;
import com.rapideact.model.view8syou.EmpView;

@WebServlet("/EmpServlet8syou")
public class EmpServlet8syou extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpServlet8syou() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Emp処理クラスを呼び出し
		EmpLogic empLogic = new EmpLogic();
		EmpView empView = empLogic.setEmpView("1");

		//リクエストスコープへ保存
		request.setAttribute("empView", empView);

		//フォワード
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/result8syou.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}