<%@ page language="java" contentType="text/html; charser = UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スコープ</title>
</head>
<body>

	<h1>リクエストスコープから取得</h1>
	<p>名前：${emp.name}</p>
	<p>年齢：${emp.age}</p>


	<h1>セッションスコープから取得</h1>
	<p>名前：${empSes.name}</p>
	<p>年齢：${empSes.age}</p>

</body>
</html>