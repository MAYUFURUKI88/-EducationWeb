<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>インクルード</title>
</head>
<body>
<%
RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/header.jsp");
rd.include(request, response);
%>
<h1>インクルードサンプル</h1>
<p>本文</p>
<p>本文</p>
<p>本文</p>
<p>本文</p>
<p><%= new Date() %></p>
<jsp:include page="/WEB-INF/view/footer.jsp" />
<%@ include file="/WEB-INF/view/footer2.jsp" %>
</body>
</html>