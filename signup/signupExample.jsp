<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="./Check.js"></script>
</head>
<body>
	<form name="signup_form" method="post">
		<input type="hidden" name="sign">
		ID : <input type="text" name="userid"><br>
		PW : <input type="password" name="pwd"><br><br>
		성명 : <input type="text" name="username"><br>
		E-mail : <input type="email" name="email"><br><br>
		
		<input type="button" value="회원가입" onclick="signupCheck()">
		<input type="button" value="로그인" onclick="location.href='signinExample.jsp'">
	</form>
</body>
</html>