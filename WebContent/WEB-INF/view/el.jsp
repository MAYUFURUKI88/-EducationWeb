<%@ page language="java" contentType="text/html; charset = UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<h3>JSTL</h3>
	<p>
		<c:out value="${emp.name}"></c:out>
	</p>

	<c:if test="${emp.age >= 30}">
		<p>30歳以上です。</p>
	</c:if>

	<c:forEach var="i" begin="0" end="9" step="1">
		<c:out value="${i}" />
	</c:forEach>

	<h3>章末問題</h3>

	<c:forEach var="i" items="${list}">
		<c:if test="${i.age <= 29}">
			<p>
				名前：
				<c:out value="${i.name}" />
				、年齢：
				<c:out value="${i.age}" />
			</p>

		</c:if>

	</c:forEach>



</body>
</html>