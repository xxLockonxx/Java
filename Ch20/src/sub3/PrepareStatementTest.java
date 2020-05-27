package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;



/*
 * ��¥ : 2020/05/26
 * �̸� : �̼���
 * ���� : PrepareStatement �ǽ��ϱ�
 */
public class PrepareStatementTest {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("����� ���(����:0, ���:1)");
			System.out.print("���� : ");
			
			int choice = sc.nextInt();
			
			if(choice == 0) {
				break;	
			}
			
			System.out.print("���̵� �Է� : ");
			String uid = sc.next();
			
			System.out.print("�̸� �Է� : ");
			String name = sc.next();
			
			System.out.print("�޴��� �Է� : ");
			String hp = sc.next();
			
			System.out.print("���� �Է� : ");
			int age = sc.nextInt();
			
			insertUser(uid, name, hp, age);
			
		}while(true);
		
		System.out.println("���α׷� ����...");
		
	} // main end
	
	public static void insertUser(String uid, String name, String hp, int age) throws Exception {
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/lsj";
		String user = "lsj";
		String pass = "1234";
		
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		// 3�ܰ� - SQL ���ఴü ���� �� ������ ����
		String sql = "INSERT INTO `USER1` VALUES (?,?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setInt(4, age);
		
		// 4�ܰ� - SQL ����
		psmt.executeUpdate();
		
		// 5�ܰ� - �����ó��(SELECT�� ���)
		
		// 6�ܰ� - �����ͺ��̽� ����
		psmt.close();
		conn.close();
		
		System.out.println("INSERT �Ϸ�...");
	}
}
