package day0905;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con1 = DriverManager.getConnection
		("jdbc:oracle:thin:@127.0.0.1:"+"1521:xe","system","oracle");
		System.out.println("접속");
		
		String sql2 = "update jdbc_tab3" + "set sawon_name = ?" + "where sawon_name = ?";
		
		PreparedStatement pst1= con1.prepareStatement(sql2);
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("변경할 이름(원래이름) : ");
		String hal_name = scan.next();
		
		System.out.println("변경될 이름 : ");
		String deul_name = scan.next();
		
		pst1.setString(1, deul_name); // 수정될 이름 // 물음표가 편경된 이름을 먼저말해서 먼저 사용한다 
		pst1.setString(2,  hal_name); //원래 이름 
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1 + " 행 update ");
		// 자바 수행시 기본적으로 commit 안해도 자동 commit되어 db내용이 변경됨 
		con1.close();
		System.out.println("접속끝");
		
	} //crud에서 cru까지 완성함 
}
