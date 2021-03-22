<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
Integer count = (Integer)application.getAttribute("count");
count++;
application.setAttribute("count", count);
%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>アクセスカウント</title>
</head>
<body>
<h1><%= count %></h1>
</body>
</html>