package day0902;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbx3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		 // 급여가 15000 이상인 사원 다 출력해 보자는 
		// 출력은 자바로 이름 봉급 출력 Sanner 등을 사용 
		// 급여를 입력받음 
			// 2번째 
		 
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
			
			 //15000이상인 사원
			String sql21 = "select first_name 이름, salary 봉급 " + " from employees" + " where salary >=?"; 
			PreparedStatement ps2 = con1.prepareStatement(sql21);
			
			// class이므로 첫글자대문자 // 객체.메서드() 첫글자 소문자 d글자 x 
			// ()안에 문장 이름을 넣음 
			// 그렇다면 ? 채우기만하면 문장이 완성 
			// 방법 1 직접입력 
			// 방법 2 scanner
			
			ps2.setInt(1, 15000);
			// 1st ? 에 급여 15000을 넣어라 
			
			ResultSet rs21 = ps2.executeQuery(); // 괄호안에 없음 
			
			while(rs21.next()) {
				String fname = rs21.getString("이름");
				int salary = rs21.getInt("봉급");
				System.out.println(rs21.getRow() + "\t" + fname + "\t" + salary);
			}
			con1.close();
			System.out.println("종료");

			}
	}


