package sign;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbtabase.common.DBManager;

public class SignServlet extends HttpServlet {

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

		// 입출력 인코딩을 맞춰준다.
		req.setCharacterEncoding("euc-kr");
		resp.setContentType("text/html;charset=euc-kr");

		String id = req.getParameter("userid");
		String pw = req.getParameter("pwd");

		// 회원가입 일 경우
		if (req.getParameter("sign").equals("signup")) {
			String name = req.getParameter("username");
			String email = req.getParameter("email");

			// 디버깅
			/*System.out.println(id);
			System.out.println(pw);
			System.out.println(name);
			System.out.println(email);*/

			sql = "insert into member values((select nvl(max(seq)+1,1) from member), '"
					+ id + "', '" + pw + "', '" + name + "', '" + email + "')";

			System.out.println(sql);

			if (db.update(sql)) {
				req.setAttribute("update", "y");
				System.out.println("signup ok");
			} else {
				req.setAttribute("update", "n");
				System.out.println("signup error");
			}

			// 가입완료 페이지를 보여준다.
			RequestDispatcher rd = req
					.getRequestDispatcher("/signup/signup_ok.jsp");
			rd.forward(req, resp);
		}

		// 로그인 일 경우
		else if (req.getParameter("sign").equals("signin")) {
			// 디버깅
			/*System.out.println(id);
			System.out.println(pw);*/
			
			sql = "select username from member where userid = '" + id
					+ "' and password = '" + pw + "'";
			ArrayList<HashMap> list = db.getList(sql);

			if (list.size() == 0) {
				req.setAttribute("login", "n");
				System.out.println("login error");
			} else {
				HashMap<Object, Object> map = list.get(0);
				Object name = map.get("USERNAME");
				req.setAttribute("login", "y");
				req.setAttribute("username", name);

				System.out.println("login ok");
			}
			
			// 로그인 완료 페이지를 보여준다.
			RequestDispatcher rd = req
					.getRequestDispatcher("/signup/signin_ok.jsp");
			rd.forward(req, resp);
		}
	}
}
