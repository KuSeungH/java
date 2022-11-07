package telinfoDAO;

import java.sql.Connection;
import java.sql.Date;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import telinfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;

public class TelInfoDAO { // 나는 TelInfoDAO.java

	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;  // 전역
	
	//다른 .java에서  new TelInfoDAO()를 하면 제일 먼저 찾아오는 곳이 생성자 
	public TelInfoDAO() throws ClassNotFoundException, SQLException { // ª˝º∫
		con = new TelInfoDBConn().getConnection();
		// connection //지역
		// 진행을 찾아보았더니 접속 객체 get ->con 
		// (그러므로 다시 드라이브 로딩x url접속 x)
		// 전에는 새로운 .java에서 con을 생성하려면 전처럼
		// 오라클 드라이버로딩 + 계정에 맞는 ip설정 을 다시 할 필요없이 
		// con = new TelInfoDBConn().getConnection(); 한줄이면 됨 
		
		
		
		//전채출력을 위해(DB에서 select로 전체 사원명단을 꺼내서 자바를 사용하여)
		// 화면에 모두 출력 
		// 메소드 명은getAllInfo(), 매소드 3형식 정의문으로,return 작성
		//------------------------------------------------------
		// getAllInfo() 메서드 
		public ArrayList<TelInfoVO> getAllInof() throws SQLException{
			
			ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
			String sql = "SECET * FROM TelTable5 ORDER BY id";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				Date d = rs.getDate("d");
				
				TelInfoVO vo = new TelInfoVO(id,name,tel,d);
				
				//VO∞¥√ºø° ≥÷±‚
				tiarray.add(vo); //VO∞¥√º -> collectionø° ≥÷±‚
			}
			return tiarray;
			


		}
public boolean insert_nametel//자료입력 메서드 3형삭 정의문 
(int id, String name, String tel, String sDate) {//21070908 들어올 경우 2107-09-08로 변경함 
	String sql = "insert into TelTable5 values(?,?,?,to_date(?))"; //to_date(?)
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, sDate); //날짜 2107-09-08
			pstmt.executeUpdate(); // db로 insert
			
		} catch(SQLException e) {
			System.out.println("insert Exception");
			return false;
		}
		return true;
		


}
// 수정메서드 // 메서드정의문 라서 위치나 순서는 무관 
public boolean update_nametel(String name, String name2) {
								//원래이름   // 바꿀이름 

	String sql = "update TelTable5 set name =? where name=?";
	try{
        pstmt=con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, name2);
        pstmt.executeUpdate();//////////
}catch(SQLException e){
        System.out.println("update Exception");
        return false;
}
return true;
}


public boolean delete_nametel(int id){ // 삭제 //메서드 정의문 
                String sql = "delete from TelTable5 where id=?";
                try{
                        pstmt=con.prepareStatement(sql);
                        pstmt.setInt(1, id);
                        pstmt.executeUpdate();//////////
                }catch(SQLException e){
                        System.out.println("delete Exception");
                        return false;
                }
                return true;
        }
}