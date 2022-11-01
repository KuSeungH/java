package day0902;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		 // 급여가 15000 이상인 사원 다 출력해 보자는 
		// 출력은 자바로 이름 봉급 출력 Sanner 등을 사용 
		// 급여를 입력받음 
		
		 
			//--q)급여가 15000이상인 사원 다 출력 해보자
			//출력은 자바로,이름 봉급 출력,Scanner등을 사용
			Connection con1 = null;

			Class.forName("oracle.jdbc.driver.OracleDriver");

			con1 = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:"+"1521:xe","HR","HR");
			System.out.println("접속");

			Scanner scan = new Scanner(System.in);
			System.out.println("받는돈 입력");
			int money = scan.nextInt();

			String sql2="select *"
			+" from employees"
			+" where salary>="+money;
			java.sql.Statement st2 = con1.createStatement();

			ResultSet rs2 = st2.executeQuery(sql2);

			while(rs2.next()) {
			String name = rs2.getString("first_name");
			int salary = rs2.getInt("salary");

			System.out.println(rs2.getRow()+'\t'+name+'\t'+salary);
			}
			con1.close();
			System.out.println("종료");

			}
	}


