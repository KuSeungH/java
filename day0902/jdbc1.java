package day0902;

public class jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// jdbc
		// jdbc --연동-- db
		// 드라이버 프로그램 : by oracle
		// oracle14.jar  ojdc6.jar ojdbc8.jar
		
		// jdbc 를 위해 드라이버를 자바프로젝트에 add해야 
		
		// ojdbc8.jar 드라이버 위치 
		// sqldeveloper아래 jdbc/lid에 있음 
		
		// or 오라클 18c 설치된곳 /jdbc/lib
		
		
		package jdbc;

		import java.sql.Connection;
		import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

		public class Jd1 {

		public static void main(String[] args)
		throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con1=null;

		//you know..? (이런방법도 사용가능,BUT add external jar권장)
		//ojdbc8.jar를
		// c:...../Java/jre/lib/ext에 넣는것
		//(그래도 안되면 할수없이 /Java/jdk/jre/lib/ext..)
		Class.forName("oracle.jdbc.driver.OracleDriver");




		con1 = DriverManager.getConnection //db접속
		("jdbc:oracle:thin:@127.0.0.1:"
		+ "1521:xe","hr","hr");
		// port //sid
		//("jdbc:oracle:thin:@127.0.0.1:"+"1521:xe","hr","hr");
		// @192.168.3.2 //localhost

		System.out.println("접속완료");
		
		//db 자료를 자바로 꺼내보자 (crud 중 r)
	
		// ajax onReadyStateChange ... x -> onreadystatechange o 
	// String sql2 = "select * from employess";
	// String sql2 = "select * from" +"employess";// sql 문장은 줄바꾸면 한칸 띄움 
		// String sql2 = "select * from employess" + " where firt_name=Steven";
		
		Scanner sc1 =new Scanner(System.in);
		System.out.println("검색할 사원 이름 : ");
		String irum = sc1.next();
		String sql2 = "select * from employess" +  "wherr first_name = '" + irum + "'"; 
    Statement st2 = con1.createStatement();
    ResultSet rs2 = st2.executeQuery(sql2);
    
    while (rs2.next()) {
    	int id = rs2.getInt("employee_id"); //객체.매소드 
    	//int id = rs2.getInt(1) // 객체.매서
    	String fname = rs2.getString("frist_name");
    	//String fname = rs2.getString(2)
    	int salary=rs2.getInt("salary"); //rs.getString(8)
    	int d_id=rs2.getInt("department_id");//rs2.getString(11)
    	String email= rs2.getString("email");
    	String l_name= rs2.getString("l_name");
    	String h_date= rs2.getString("h_date");
    	String hire_date=h_date.substring(0,10); //년월일만 
    	
    	System.out.println(rs2.getRow() + "\t" + id + "\t"
    			+h_date+ "\t" + fname + "\t" + l_name+ "\t" + salary + "\t"
    			 + d_id + "\t" + email);
    	 //h_date 맨뒤 출력해봄 
    	//2006-05-23 00:00:00=>db에서 보면 06/05/23
    }
    
    con1.close();
    System.out.println("접속끝");
	
    
    
    
    
    
    

	}

}
