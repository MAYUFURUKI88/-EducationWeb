<%@ page language="java" contentType="text/html; charser = UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.rapideact.model.Emp"%>

<%
Emp emp = (Emp) request.getAttribute("emp");
Emp empSes = (Emp) session.getAttribute("empSes");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スコープ</title>
</head>
<body>

	<h1>リクエストスコープから取得</h1>
	<%
	if (emp != null) {
	%>
	<p>
		名前：<%=emp.getName()%></p>
	<p>
		年齢：<%=emp.getAge()%></p>
	<%
	} else {
	%>
	<p>リクエストスコープ null</p>

	<%
	}
	%>


	<h1>セッションスコープから取得</h1>
	<%
	if (empSes != null) {
	%>
	<p>
		名前：<%=empSes.getName()%></p>
	<p>
		年齢：<%=empSes.getAge()%></p>
	<%
	} else {
	%>
	<p>セッションスコープ null</p>

	<%
	}
	%>


</body>
</html>