<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>servletEx03Action</title>
<script>
		console.log("${sessionScope.id }");
		console.log("${sessionScope.role}");
		console.log("${sessionScope.isMobile }");	
</script>


</head>
<body>

	<h3>세션확인: ${sessionScope.id } / ${sessionScope.role}/ 
	${sessionScope.isMobile }</h3>
	<hr>
	
	<p><a href="servletEx03MyPage">마이페이지로 이동하기</a></p>
	<p><a href="servletEx03Cart">카트리스트로 이동하기</a></p>
	
</body>
</html>