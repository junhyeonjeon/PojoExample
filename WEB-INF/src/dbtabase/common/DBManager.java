package dbtabase.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class DBManager {
	// 상수로 DB 연결 문자열
	static final String connString = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static final String id = "scott";
	static final String pw = "tiger";

	// 생성자 - DB 연결
	public DBManager() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver load fail");
		}

	}

	// DB에서 필요한 쿼리를 입력받아서 그 결과를
	// Arraylist 에 담아 반환
	// 즉 sql문을 매개변수로 받아 실행결과를 반환하는 함수이다.
	public ArrayList<HashMap> /* ResultSet */getList(String sql) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<HashMap> list = new ArrayList<HashMap>();

		try {
			conn = DriverManager.getConnection(connString, id, pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs != null) {
				while (rs.next()) {
					HashMap<Object, Object> map = new HashMap<Object, Object>();
					for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
						map.put(rs.getMetaData().getColumnName(i),
								rs.getString(i));
					}
					list.add(map);
				}
			}

			/*
			 * if (rs.next() == true) { while (rs.next()) {
			 * System.out.println(rs.getObject(1) + " " + rs.getObject(2) + " "
			 * + rs.getObject(3)); } }
			 */

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 이부분은 항상 들리기 때문에 여기서 연결을 종료해야 된다.
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception ex) {
			}
		}
		return list;
	}

	public boolean update(String sql) {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DriverManager.getConnection(connString, id, pw);
			stmt = conn.createStatement();

			// insert, update, delete
			int n = stmt.executeUpdate(sql);
			// 수정된 레코드 개수 반환

			if (n > 0)
				return true;
			else
				return false;

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 이부분은 항상 들리기 때문에 여기서 연결을 종료해야 된다.
		finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception ex) {
			}
		}
		return true;
	}
}
