package quiz;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int i = 2022
		// i해가 윤년인지 아닌지 출력하시오 (단, 메소드 2혁식 사용)
		// 윤년이란? 
		// 1년 365.2422일 
		// 0.2422*4=0.9688
		
		// 4년 마다 윤년이고 
		// 100년 마다 평년이고
		// 400년 마다 윤년이다 
		
		// i를 4로 나누어 떨어지고 
		// i를 100으로 나누어 떨어지지 않거나 
		// i를 400으로 나누어 떨어지면 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하삼");
		int i = sc.nextInt();
		// 윤년 i%4==0  && i%100!=0 || i%400==0
		// if(윤년?)
		
		kajaKyesan(i);
		
		
		
		
	} // main-end

	private static void kajaKyesan(int i) {
		// TODO Auto-generated method stub
		if(i%4==0  && i%100!=0 || i%400==0)
			System.out.println(i+ "윤년");
		else
			System.out.println(i+ "평년");
	}

}
