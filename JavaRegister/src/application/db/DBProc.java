package application.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class DBProc {
	
	private final String HOST = "jdbc:mysql://192.168.44.7:3306/lsj";
	private final String USER = "lsj";
	private final String PASS = "1234";
	
	// �̱��� ��ü
	public static DBProc instance = new DBProc();
	
	public static DBProc getInstace() {
		return instance;
	}
	private DBProc() {}
	
	public void insertUser1(String uid, String name, String hp, String pos, int dep) throws Exception {
		//1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		//2�ܰ� - �����ͺ��̽� ����
        Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		
		//3�ܰ� - SQL���� ��ü ����
        Statement stmt = conn.createStatement();
        
		//4�ܰ�
        String sql = "INSERT INTO `MEMBER` VALUES ('"+uid+"','"+name+"','"+hp+"','"+pos+"',"+dep+", NOW())";
        stmt.executeUpdate(sql);
        		
        //5�ܰ�
		//6�ܰ� - �����ͺ��̽� ����
        conn.close();
        
        System.out.println("INSERT1 �Ϸ�...");
	}
	
	public void insertUser2(String uid, String name, String hp, String pos, int dep) throws Exception {
		//1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		//2�ܰ� - �����ͺ��̽� ����
        Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		
		//3�ܰ� - SQL���� ��ü ����
        String sql = "INSERT INTO `MEMBER` VALUES (?,?,?,?,?, NOW())";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setString(1, uid);        
        psmt.setString(2, name);        
        psmt.setString(3, hp);        
        psmt.setString(4, pos);        
        psmt.setInt(5, dep);        
        
		//4�ܰ� - SQL����
        psmt.executeUpdate();
        		
        //5�ܰ�
		//6�ܰ� - �����ͺ��̽� ����
        conn.close();
        
        System.out.println("INSERT2 �Ϸ�...");
			}
}
	

