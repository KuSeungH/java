package day0905;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con1 = DriverManager.getConnection
		("jdbc:oracle:thin:@127.0.0.1:"+"1521:xe","system","oracle");
		System.out.println("접속");
		
		String sql2 = "delete jdbc_tab3" +  "where sawon_name = ?";
		
		PreparedStatement pst1= con1.prepareStatement(sql2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름(원래이름) : ");
		String del_name = scan.next();
		

		pst1.setString(1, del_name); 
		
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1 + " 행 delete ");
		// 자바 수행시 기본적으로 commit 안해도 자동 commit되어 db내용이 변경됨 
		con1.close();
		System.out.println("접속끝");
		
	}
}
