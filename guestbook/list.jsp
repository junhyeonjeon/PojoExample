<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@page import="com.hoseo.guestbook.dto.*"%>
<%@page import="com.hoseo.guestbook.dao.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		GuestbookDao dao = new GuestbookDao();
		ArrayList<GuestbookDto> list = dao.getList();

		for (int i = 0; i < list.size(); i++) {
			GuestbookDto dto = list.get(i);
			out.println(dto.getSeq() + "<br>");
			out.println(dto.getTitle() + "<br>");
			out.println(dto.getContents() + "<br>");
			out.println(dto.getWriter() + "<br>");
			out.println(dto.getWdate() + "<br>");
		}
	%>

</body>
</html>