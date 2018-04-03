package kosta.matchat.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB���� �ε�, ����, �ݱ⸦ ���� Ŭ����
 * @author onething
 *
 */
public class DBUtil {
	/**
	 * �ε�
	 */
	static {
		try {
			Class.forName(DBProperty.DRIVER_NAME);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * ����
	 */
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(
				DBProperty.URL, DBProperty.USER_NAME, DBProperty.USER_PASS);
	}
	
	/**
	 * �ݱ�
	 * insert, update, delete�� ���
	 */
	public static void dbClose(Connection con, Statement st) {
		try {
			if(st!=null)st.close();
			if(con!=null)con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * select���
	 */
	public static void dbClose(Connection con, Statement st, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(con!=null)con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
