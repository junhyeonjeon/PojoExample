<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="./inputCheck.js"></script>
</head>

<body>
	<form name="form" method="post">
		�̸� : <input type="text" name="name"><br> 
		��ȭ : <input type="text" name="phone"><br> 
		�̸��� : <input type="email" name="email"><br>
		<a href="#none" onclick="goSend()">���</a>
	</form>
</body>
</html>