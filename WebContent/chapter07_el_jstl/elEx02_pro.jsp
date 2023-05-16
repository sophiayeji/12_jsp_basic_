<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el 테스트</title>
</head>
<body>

	<%
		request.setCharacterEncoding("utf-8");
		session.setAttribute("id", request.getParameter("id"));
		session.setAttribute("name", request.getParameter("name"));
		session.setAttribute("isMobile", true);
	%>


	<h3><a href="elEx02_session.jsp">다음페이지로 이동</a></h3>


	<p>이름: ${param.name }</p>
	<p>아이디: ${param.id }</p>
	<p>패스워드: ${param.pwd }</p>
	<p>성별: ${param.gender }</p>
	
	<p>취미: ${paramValues.hobbies[0] }</p>
	<p>취미: ${paramValues.hobbies[1] }</p>
	<p>취미: ${paramValues.hobbies[2] }</p>
	
	<p>가고 싶은 여행지: ${param.travel }</p>
	<p>메모: ${param.content }</p>
	




</body>
</html>