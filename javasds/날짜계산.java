package javasds;

import java.util.Date;

public class 날짜계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// 만난지 100일 계산 
		// 오늘 만난 사람과 만난지 100일 되는 날이 몇년 몇월 몇일인지를 출력하시오 
		
		Date d7 = new Date(); //정의 x 생성부터 //오늘 날짜 
		// 기준 날짜는 1970년 1월 0시 0분 0초로 자바에서 지정이 되어있다  
		
		
		d7.setDate(d7.getDate() + 100 - 1 ); // 만난지 100일 // 계산할때 99일이니 항상 1을 뺴자 
		System.out.println(d7.toLocaleString());
		
		// 자신의 생일을 사용하여 오늘까지  살아온 날을 출력하시오 
		
		//생일구하는거 
		// Date = mybir = new Date(년, 월,일 시,분,);
		Date  mybir =  new Date((1998-1900),(9-1),5);
		// d7 - mybir 이렇게는 계산은 안된다 
		long cha = d7.getTime() - mybir.getTime(); // getTime() =오늘까지의 날짜 수 
		// 밀리세컨드 cha를 날짜로 변환처리 
		// 1초는 1000밀리세컨드다  초 : 1000 시간 : 3600 날짜 : 24
		long nal = cha/1000/3600/24;
		System.out.println("살아온 날짜수는 " + nal + "일 이군요!");

	}

}