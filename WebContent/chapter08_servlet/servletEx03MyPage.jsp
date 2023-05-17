<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${pageTitle }</title>
<script>
	console.log("세션 : ${sessionScope.id} / ${sessionScope.role} / ${sessionScope.isMobile}" );
	console.log("리퀘스트 : ${pageTitle} / ${userName} / ${email}");
</script>
</head>
<body>

	<h3>세션 확인 : ${sessionScope.id } / ${sessionScope.role } / 
	${sessionScope.isMobile } </h3>
	
	<hr>
	
	<h3>리퀘스트 확인 : ${requestScope.userName } / ${email }</h3>
	
</body>
</html>