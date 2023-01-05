package javasds;

import java.util.Date;

public class 다중상속5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//jdbc
		
		Date d1 = new Date(); // 입사일 처리등 날짜 처리 
		System.out.println(d1);
		// 결과 : Tue Aug 23 09:11:48 KST 2022
		System.out.println(d1.toLocaleString()); // deprecated : 옛날버전이라 줄이 처져있지만 오류는 안난다 
		// 결과 : 2022. 8. 23. 오전 9:11:48
		// toLocaleString : 지역시간 
		
	
		//  오늘 날짜는 2022년 8월 23일 입니다 // 이런식으로 나오는 함수는 없고 직접 만들어야 한다 
		String str1 = "오늘 날짜는 ";
		
		// System.out.println(d1.getYear());	// 122
		System.out.println(d1.getYear()+1900); // 1900을 더하면 2022년이 된다 
		
		String [] yoil = {"일","월","화","수","목","금","토"};
		
		
		str1 += d1.getYear()+1900 + "년 "; // str1 = str1+ 오늘 날짜에다가 뒤에있는걸 누적하는거 이다 
		str1 += d1.getMonth() + 1 + "월 "; // 1월 = 0 2월 = 1 이런식으로 항상 1을 더해야 한다   
		str1 += d1.getDate() + "일이고 "; // 날짜 
		str1 += yoil[d1.getDay()] + "요일 입니다";
		// getDay = 요일 
		// 요일은 일 = 0, 월 = 1, 화 = 2, 수 = 3, 목 = 4, 금 = 5, 토 = 6 
		System.out.println(str1); 
		
		// String a1= "";
		// apple
		// _____
		// 0 1 2 3 4 
		// 일 월 화 수 목 
		
		
		
		
		// util, sql
		// import 선택시 
		//java.sql.Date(디비일때 ) , java.util.Date (자바일때)
		//(참고) System 클래스 : java.long 인데 안씀 
							// import java.lang.System x
		// import 패키지명.클래스명 
		// (예) import java.util.Date		
							// java.util방에 있는 Date.class를 갖고와서 사용 
		
		// 사용자정의 클랫 (객체 ) (user-defined class)		class-new- 사용 
		// 내장클래스(객체) new- 사용 
	}	

}
