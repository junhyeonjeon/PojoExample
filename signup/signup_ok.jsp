<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Object signup_Check = request.getAttribute("update");

		//location.href = "signupExample.jsp";
		if (signup_Check.equals("y")) {
	%>
	<h1>가입을 축하 드립니다</h1>
	<%
		} else if (signup_Check.equals("n")) {
	%>
	<h1>알 수 없는 오류로 가입에 실패하셨습니다</h1>
	<%
		}
	%>
	<a href="signup/signupExample.jsp">홈으로</a>
</body>
</html>