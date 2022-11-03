package day0905;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class sqljdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// 플잭을 작성한다면 
				// 파일 4개 saerch.java, insert.java, update.java, delete.java 
				// meun.java
				
				// 1. 사원입력 
				// 2. 사원수정 
				// 3. 사원 삭제
				// 4. 사원 검색 
				// 5. 종료 
				// 선택(1~5) 3
				
				// search.java 
				// 앞부분  : db 연결 작성 + 검색하는 로직 
				// update.java
				// 앞부분  : db 연결 작성 + 수정하는 로직 
		
		// Q) 급여가 15000 이상인 사원이거나 
		//매니저 아이디가 150이상인 경우 
		// 단 메니저 아이다가  null을 제외
		// ==> Scanner 사용 ? 사용 
		
		Connection con1 = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con1 = DriverManager.getConnection
		("jdbc:oracle:thin:@127.0.0.1:"+"1521:xe","HR","HR");
		System.out.println("접속");
		
		String sql2 = " select first_name 이름, salary봉급," 
		+ "mamager_id 매니저 아이디 from employess "
		+ "where (salary >= ? or manager_id >= ?)"
		+ "and mamager_id is not null";
		
		// Statement st2 = con1.createStatement(); // prepareStatement사용
		PreparedStatement ps2= con1.prepareStatement(sql2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("받는돈 입력");
		int salary_bada = scan.nextInt(); //예 15000입력 
		
		System.out.println("매니저아이디 얼마이상 다나와 ?");
		int m_id = scan.nextInt(); //예 150입력  
		
		
		ps2.setInt(1, salary_bada);// 물음표 순서대로 값을 넣어야 한다 
		ps2.setInt(2, m_id); 
		// ResultSet rs2 = st2.executeQuery(sql2)
		ResultSet rs2 = ps2.executeQuery(); // 괄호안에 없음 
		
		while(rs2.next()) {
			String fname=rs2.getString("이름"); // alias 활용(ㅊ마고 : 번쨰 컬럼 )
			int salary = rs2.getInt("봉급");
			int m_id2 = rs2.getInt("매니저 아니디 ");
			System.out.println(rs2.getRow() + "\t" + fname + "\t" + salary + "\t" + m_id2);
			
		}
		con1.close();
		System.out.println("접속끝");
		

	}

}
