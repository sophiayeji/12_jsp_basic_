<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
	
		//DB에서 SELECT 쿼리 인증로직
		String role ="admin";
		
		session.setAttribute("id", id);
		session.setAttribute("role", role);
		
	%>

	<h3>로그인 되었습니다.</h3>
	<p>아이디: <%=id %> (권한 <%=role %>)</p>
	
	<p><a href="sessionEx02_03.jsp">마이페이지</a></p>
	<p><a href="sessionEx02_04.jsp">장바구니</a></p>
	<p><a href="sessionEx02_05.jsp">로그아웃</a></p>
	
</body>
</html>