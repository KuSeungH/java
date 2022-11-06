package javaDB0905;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class javamain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
			
			int sel = 0;
			TelInfoDAO tidao = new TelInfoDAO();
			do{
				System.out.println("비상연락망관리!!");
				System.out.println("-------------------");
				System.out.println("1: 한명입력");
				System.out.println("2: 수정");
				System.out.println("3: 삭제");
				System.out.println("4: 전채출력");
				System.out.println("5: 종료");
				System.out.println("--------------------");
				System.out.println("이용할 메뉴를 선택하세요");
				sel = Integer.parseInt(JOptionPane.showInputDialog("메뉴선택"));
				
				switch (sel) {
				
				case 1:
					int id = Integer.parseInt(JOptionPane.showInputDialog("아이디는?"));
					String name = JOptionPane.showInputDialog("이름은?");
					String tel = JOptionPane.showInputDialog("전화번호는?");
					String sDate = JOptionPane.showInputDialog("날짜는?"); //201600908
					
					//dao에 insert_nametel()메서드 정의문을 만들고 db에 저장 
					// 단, 메서드 반환형은 boolean
					boolean b1 = tidao.insert_nametel(id, name, tel, sDate);
						// 객체.메서드() 호출문(2형식)
					
				if(b1) // true냐
					System.out.println("insert ok");
				else
					System.out.println("insert error");
				break;
				
				case 2: //업데이트 
					String n1 = JOptionPane.showInputDialog("기존 이름은?");
					String n2 = JOptionPane.showInputDialog("바뀔 이름은?");
					
					boolean b2 = tidao.update_nametel(n1,n2); //호출문 
							      // 출발한 지금호출문을 지우고 그자리에 들어옴 
					if(b2)
					// JOptionPane.showMessageDialog(null, "update했다고 전해라");
						System.out.println("update ok");
					else
						System.out.println("update error");
					break;
				
					
				case 3: // 삭제
					int deild
					= Integer.parseInt(JOptionPane.showInputDialog("삭제할 아이디는?"));
					
					
					boolean del = tidao.delete_nametel(deild); // 호출문 
					if(del) // del>o x (del)은 true냐?
						
						System.out.println("delete ok");
					else
						System.out.println("delete error");
					break;
					
					
				
				case 4:
					ArrayList<TelInfoVO> tiArray = tidao.getAllInof();
												// 객체.메서드() 호출문 -> DAO를 찾아간다
					for(TelInfoVO ismi : tiArray) {
						System.out.print(ismi.getId()+"\t");
						System.out.print(ismi.getName()+"\t");
						System.out.print(ismi.getTel()+"\t");
						System.out.println(ismi.getD()+"\t");
					}
					break;
					
				case 5:
					System.exit(1);
					break;
		} // swich문 - end
			
	}while(sel !=5); // while end
	}// main end
} // class end
