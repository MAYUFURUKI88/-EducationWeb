package com.rapideact.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rapideact.model.Emp;

@WebServlet("/JstlServlet7syoumatu")
public class JstlServlet7syoumatu extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public JstlServlet7syoumatu() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Emp emp = new Emp("田中", 30);
		request.setAttribute("emp", emp);

		Emp emp2 = new Emp("古木", 27);
		Emp emp3 = new Emp("小林", 29);
		Emp emp4 = new Emp("福永", 29);
		Emp emp5 = new Emp("葉山", 30);
		Emp emp6 = new Emp("阿部", 30);

		List<Emp> list = new ArrayList<>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		request.setAttribute("list", list);

		Map<String, Emp> map = new HashMap<>();


		map.put("a", emp2);
		map.put("b", emp3);
		map.put("c", emp4);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/el.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
