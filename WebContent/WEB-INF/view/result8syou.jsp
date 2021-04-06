<%@ page language="java" contentType="text/html; charset = UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset = "UTF-8">
<title>Daoサンプル</title>
</head>
<body>
<h1>empテーブル取得結果</h1>
<p>id:<c:out value = "${empView.emp.id}" /></p>
<p>name:<c:out value = "${empView.emp.name}" /></p>
<p>birth:<c:out value = "${empView.emp.birth}" /></p>
</body>
</html>