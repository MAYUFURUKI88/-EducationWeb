<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
int a = 10;
int b = 20;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト</title>
</head>
<body>
	<%-- JSPコメント --%>
	<p><%=a%>
		×
		<%=b%>
		=
		<%=a * b%></p>
	<%
	for (int i = 0; i < 10; i++) {
	%>
	<p>フォー文</p>
	<%
	}
	%>

</body>
</html>