<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx_풀이</title>
</head>
<body>
	 <c:set var="dbId" value="1234" />
 	<c:set var="dbPw" value="1234" />
 	
 	<c:choose>
 		<c:when test="${dbId eq id and dbPw eq pw }">
 			로그인 성공
 		</c:when>
 		<c:otherwise>
 			로그인 실패
 		</c:otherwise>
 	</c:choose>

</body>
</html>