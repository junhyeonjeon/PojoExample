package com.hoseo.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbtabase.common.DBManager;

public class Util extends HttpServlet {

	DBManager db = new DBManager();
	String sql;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("EUC-KR");
		resp.setCharacterEncoding("ECU-KR");
		
		String title = req.getParameter("title");
		String contents = req.getParameter("contents");
		String writer = req.getParameter("writer");

		sql = "insert into guestbook values((select nvl(max(seq)+1,1) from guestbook), '"
				+ title
				+ "', '"
				+ contents
				+ "', '"
				+ writer
				+ "', sysdate, 'n')";
		System.out.println(sql);

		if (db.update(sql)) {
			System.out.println("write ok");
		} else {
			System.out.println("write error");
		}

		RequestDispatcher rd = req.getRequestDispatcher("/guestbook/list_ok.jsp");
		rd.forward(req, resp);
	}

}
