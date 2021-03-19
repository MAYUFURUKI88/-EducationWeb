package com.rapideact.controller;

import java.io.IOException;

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

		//セッションスコープにempという名前でEmpインスタンスを保存
		session.setAttribute("emp", emp);

		//リダイレクト


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
