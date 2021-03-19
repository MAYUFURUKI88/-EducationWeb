<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="Practice2Servlet" method="get">
		<input type="text" name="name"><br>
		<textarea name="area" rows="5"></textarea>
		<br> <label><input type="radio" name="sex" value="男性">男性</label>
		<label><input type="radio" name="sex" value="女性">女性</label><br>
		<input type="checkbox" name="check" value="ビール">ビール
		<input type="checkbox" name="check" value="焼酎">焼酎
		<input type="checkbox" name="check" value="ウイスキー">ウイスキー<br>
		<select name = "pref">
			<option value = "北海道">北海道</option>
			<option value = "青森">青森</option>
			<option value = "秋田">秋田</option>
		</select><br>
		<input type = "hidden" name = "hid" value = "param">
		<input type = "submit" value = "送信">
		</form>

</body>
</html>