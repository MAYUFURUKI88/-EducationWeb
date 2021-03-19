<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp</title>
</head>
<body>

<%@ page import = "servlet2.EMP" %>
<%
	EMP emp = new EMP("古木眞祐");

 %>
<%= emp.getName() %>

<% for(int i = 3; i < 12; i = i + 3) { %>
<p>値：<%= i %></p>

<%} %>
</body>
</html>