<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<%@ page import="database.common.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");

		DBManager db = new DBManager();
		String sql;

		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String writer = request.getParameter("writer");

		sql = "insert into guestbook values((select nvl(max(seq)+1, 1) from guestbook), '"
				+ title
				+ "', '"
				+ contents
				+ "', '"
				+ writer
				+ "', sysdate, 'n')";

		if (db.update(sql)) {
			System.out.println("write ok");
		} else {
			System.out.println("write error");
		}
	%>
	<script type="text/javascript">
		location.href = "/PojoExample/guestbook/list.jsp";
	</script>
</body>
</html>