<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cart</title>
</head>
<body>

	<h3>장바구니</h3>
	<%
		//String id = request.getParameter("id");
		//String role = request.getParameter("role");
	
		String id = (String)session.getAttribute("id");
		String role = (String)session.getAttribute("role");
	%>
	<p><%=id %>(권한<%=role %>)님 로그인 중</p>

</body>
</html>