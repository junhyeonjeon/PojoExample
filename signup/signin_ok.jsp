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
		Object signin_Check = request.getAttribute("login");
		Object username = request.getAttribute("username");

		if (signin_Check.equals("y")) {
	%>
	<h1><%=username%>�� ȯ���մϴ�.
	</h1>
	<%
		} else if (signin_Check.equals("n")) {
	%>
	<h1>�α��� ����</h1>
	<%
		}
	%>
	<a href="signup/signupExample.jsp">Ȩ����</a>
</body>
</html>