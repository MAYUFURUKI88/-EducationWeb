
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Daoサンプル</title>
</head>
<body>
<h1>empテーブル取得結果</h1>
<p>id：<c:out value="${empView.emp.id}" /></p>
<p>name：<c:out value="${empView.emp.name}" /></p>
<p>birth：<c:out value="${empView.emp.birth}" /></p>

<h1>empテーブル全件取得結果</h1>
<table>
<c:forEach var="member" items="${empView2.allemp}">
<tr>
<td><c:out value = "${member.id}" /></td>
<td><c:out value = "${member.name}" /></td>
<td><c:out value = "${member.birth}" /></td>
</tr>
</c:forEach>
</table>
</body>
</html>