<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx07풀이</title>
</head>
<body>

	<c:if test='${me == "바위"}'>
		<h1>비겼다.</h1>
	</c:if>	
	<c:if test='${me == "보"}'>
		<h1>내가 이겼다.</h1>
	</c:if>	
	<c:if test='${me == "가위"}'>
		<h1>내가 졌다.</h1>
	</c:if>	

</body>
</html>