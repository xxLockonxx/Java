package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * ��¥ : 2020/05/26
 * �̸� : �̼���
 * ���� : JDBC Select �ǽ��ϱ�
 */
public class SelectTest {
	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/lsj";
		String user = "lsj";
		String pass = "1234";
		
		// 1�ܰ� - JDBC����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3�ܰ� - SQL���ఴü ����
		Statement stmt = conn.createStatement();

		// 4�ܰ� - SQL����
		String sql = "SELECT * FROM `USER1`";
		ResultSet rs = stmt.executeQuery(sql); // �̹����� ����� DB���� �޾ƿ;� �ϱ� ������(Result Set)
		
		
		// 5�ܰ� - �����ó��(SELECT�� ���)
		while(rs.next()) {
			System.out.println("===========================");
			System.out.println("���̵� : "+rs.getString(1));
			System.out.println("��   �� : "+rs.getString(2));
			System.out.println("�޴��� : "+rs.getString(3));
			System.out.println("��   �� : "+rs.getInt(4));
		}
		
		
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
		
		
		
	}

}
