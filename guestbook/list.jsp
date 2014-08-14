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
<script type="text/javascript" src="./Check.js"></script>
</head>
<body>
	<form name="guestbookForm" method="post">
		<h5>&lt;작성자명&gt;</h5>
		<input type="text" name="writer">
		<h5>&lt;제목&gt;</h5>
		<input type="text" name="title">
		<h5>&lt;내용&gt;</h5>
		<textarea name="contents" rows="5" cols="80"></textarea>
		<input type="button" value="작성완료" onclick="goWrite()">
	</form>
	<br>
	<br>

	<%
		GuestbookDao dao = new GuestbookDao();
		ArrayList<GuestbookDto> list = dao.getList();

		if (list.size() == 0) {
	%>
	<h4>등록된 방명록이 없습니다</h4>
	<%
		} else {
			for (int i = 0; i < list.size(); i++) {
				GuestbookDto dto = list.get(i);
				out.println(dto.getSeq() + "<br>");
				out.println(dto.getTitle() + "<br>");
				out.println(dto.getContents() + "<br>");
				out.println(dto.getWriter() + "<br>");
				out.println(dto.getWdate() + "<br><br>");

			}
		}
	%>
</body>
</html>