package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * ��¥ : 2020/05/26
 * �̸� : �̼���
 * ���� : JDBC ���α׷���
 */
public class JDBCTest {
	
	public static void main(String[] args) throws Exception {
		
		//DB ����
		String host = "jdbc:mysql://192.168.44.7:3306/lsj";
		String user = "lsj";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("�����ͺ��̽� ���� ����");
		}
		//3�ܰ�
		//4�ܰ�
		//5�ܰ�
		
		//6�ܰ� - �����ͺ��̽� ����
		conn.close();
	}
}
