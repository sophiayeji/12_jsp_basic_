<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 전송 기초1</title>
<script>
	
	function submitData() {

		// submit(); 메서드를 사용하여 폼데이터를 서버로 전송한다.
		document.f.submit();
		
	}
	
</script>
</head>
<body>

	<%--
	
		# 폼 데이터 전송
	
		action : 데이터를 전송할 위치를 작성한다.
		method : 입력데이터가 서버로 보내지는 방법을 기술한다. GET과 POST 방식이 있고 기본방식은 GET방식이다. 
	
			- GET방식 : URL 주소 뒤에 파라미터를 붙여서 데이터를 전달하는 방식.
			            ? 기호 앞에적힌 곳은 URL주소가 되고 
			            ? 기호 뒤에 오는 값들이 서버로 전달되는 파라미터 값이 된다.
			
			- POST방식 : 사용자가 입력한 데이터를 URL 주소에 붙이지 않고 
			             HTTP Request 헤더에 포함시켜서 전송하는 방식이다.
			
	 --%>


	<form action="formEx01Pro.jsp" method="post" name="f">
		<fieldset>
			<legend>데이터 전송기초</legend>
			<p>이름 : <input type="text"   name="name"></p>
			<p>연락처 : <input type="text" name="contact"></p>
			<p>나이 : <input type="text"   name="age"></p>
			
			<!-- 방법 1) submit 타입을 사용하여 전송한다.(가장 일반적인 방법) -->			
			<p><input type="submit" value="전송"></p>
			
			<!-- 방법2) 자바스크립트의 submit()함수를 사용하여 전송한다. -->
			<p><input type="button" value="js전송" onclick="submitData()"></p>
			
		</fieldset>
	</form>

</body>
</html>