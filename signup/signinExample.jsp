<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인 화면</title>
<script type="text/javascript" src="./Check.js"></script>
</head>
<body>
	<form name="signin_form" method="post">
		<input type="hidden" name="sign" value="signin">
		아이디 : <input type="text" name="userid"><br> 
		패스워드 : <input type="password" name="pwd"><br><br>
		<input type="button" value="로그인" onclick="signinCheck()">
	</form>
</body>
</html>