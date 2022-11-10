package telinfoDBConn;

import java.net.BindException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn { //TelInfoDBConn.java

	
		
		private Connection con; // 접속객체 
		
		public Connection getConnection() { //접속객체 getter 작성 
			return con;
		}
		
		// 다른 .java에서 new TelInfoDBConn() 한후에 getConnction()를 호출하면 
		// con 접속객체가 전달됨 
		//즉 new TelInfoDBConn()하면 생성자가 먼저 가동되므로 아래 내용이 가동되고
		// 접속객체가 con에 들어감 
		// 그러므러 아래 내용을 매번 코딩하지 않아도 이렇게 한반 만들어 놓고 이런식으로
		// getConnect()을 호출하면 con 접속깨체 가 항상 전달 됨 
		//호출하면 con접속객체가 항상 필요한 곳은?
		// DAO (why? db 와 직접적인 연결 담당)
		
				// 아래는 생성자 
		public TelInfoDBConn() throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con= DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:"+"1521:xe","system","oracle");
			// 이부분이 바로 setter개념 
			
		}
	}
// (미리보기) #####
//다른 자바에서 TelInfoDBConnti = new TelInfoDBConn() 하면??
// (답1)TelInfoDBConn 클래스의 객체가 만들어짐 
//-----------------------------
// 			Connection con;
// -------------------------------
//			getConnection()
//--------------------------------------
//			TelInfoDBConn()
//---------------------------------------

// (답2) 생성ㅇ자가 제일 먼저 가동 
// 즉, TelInfoDBConn() 가 가동됨 
// 결과적으로 con에는 접속객체가 들어감 

// (답3) con객// (미리보기) #####
//다른 자바에서 TelInfoDBConnti = new TelInfoDBConn() 하면??
//(답1)TelInfoDBConn 클래스의 객체가 만들어짐 
//-----------------------------
//			Connection con;
//-------------------------------
//			getConnection()
//--------------------------------------
//			TelInfoDBConn()
//---------------------------------------

//(답2) 생성ㅇ자가 제일 먼저 가동 
//즉, TelInfoDBConn() 가 가동됨 
//결과적으로 con에는 접속객체가 들어감 

//(답3) con객체를 갖다가 사용하려면 
//getConnection() 매소드를 호출 

//(정리) 개발시 개발자가 할일 
//new TelInfoDBConn() + getConection()호출 
















