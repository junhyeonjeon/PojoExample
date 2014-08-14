import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample1Servlet extends HttpServlet {

	// get 방식으로 호출 했을 때
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// doget이나 dopost 한쪽으로 코드를 몰아주고 한쪽에서는 다른쪽을 실행하는 방식으로 하면 된다.
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// req는 요청을 받는 것, resp는 응답하는 것

		// 한글 안깨지게 하기 위함
		req.setCharacterEncoding("euc-kr");
		resp.setContentType("text/html;charset=euc-kr");

		// System.out.println()은 디버그 용으로 사용한다. (톰캣 콘솔창에만 출력된다)
		System.out.println("요청이 들어왔는지 확인");

		/* 파라미터 처리 */
		// form 내부의 input 태그중에 name 속성이 name인게 반드시 있어야 한다. 안그러면 null값을 받아온다.
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");

		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("전화 : " + phone);

		/*
		// out.print를 사용하기 위함(브라우저 출력용)
		PrintWriter out = resp.getWriter();
		PrintWriter out = new PrintWriter(new OutputStreamWriter(
				resp.getOutputStream(), "KSC5601"));

		out.println("<html>");
		out.println("<body>");
		out.println("이름 : " + name + "<br>");
		out.println("이메일 : " + email + "<br>");
		out.println("전화번호 : " + phone + "<br>");
		out.println("</body>");
		out.println("</html>");
		
		out.flush(); //이거 있어야 화면에 나온다.
		*/
		
		// req에 추가 정보를 더해서 넘기고 싶을 때
		req.setAttribute("address", "서울시 관악구");
		
		// 다른 jsp 페이지로 이동하기
		RequestDispatcher rd = req.getRequestDispatcher("/sample1/output.jsp");
		rd.forward(req, resp);
	}
}
