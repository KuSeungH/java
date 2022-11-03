package day0905;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class sqljdbc2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con1 = null;

	Class.forName("oracle.jdbc.driver.OracleDriver");

	con1 = DriverManager.getConnection
	("jdbc:oracle:thin:@127.0.0.1:"+"1521:xe","system","oracle");
	System.out.println("접속");

//	create table jdbc_tab3(
//	        sawon_id number(10), -- 사원아이디 
//	        sawon_name varchar2(20), -- 사원명 
//	        sawon_sal number(10), -- 사원급여 
//	        sawon_jik varchar2(20) -- 사원직책 
//	        );
//	        
//	insert into jdbc_tab3
//	values (1,'홍길동',3700000,'대리');
//	commit;
//	
	String sql2 = "insert into jdbc_tab3 valuees(?,?,?,?)";
	
	PreparedStatement pst1= con1.prepareStatement(sql2);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("사번 : ");
	int sabun = scan.nextInt();
	
	System.out.println("이름 : ");
	String irum = scan.next();
	
	System.out.println("봉급 : ");
	int bong = scan.nextInt();
	
	System.out.println("직책 : ");
	String jik = scan.next();
	
	pst1.setInt(1, sabun);
	pst1.setString(2, irum);
	pst1.setInt(3, bong);
	pst1.setString(4, jik);
	
	int rowcnt1= pst1.executeUpdate(); // 여기서는 db에 insert
	// 반환형은 insert 된 행수 
	//DML (Data Manipulation(조작,작동) Language) : 3가지 - insert, delete, update
	// select 는 query언어  (executeQuery())
	System.out.println(rowcnt1 + " 행 insert"); //insert 행 갯수 
	con1.close();
	System.out.println("접속끝");

	}
}
