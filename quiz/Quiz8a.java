package quiz;

import java.util.Scanner;

public class Quiz8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하삼");
		int i = sc.nextInt();
		// 윤년 i%4==0  && i%100!=0 || i%400==0
		// if(윤년?)
		
		System.out.println(kajaKyesan(i));
		
		
		
	}

	private static String kajaKyesan(int i) {
		// TODO Auto-generated method stub
		if(i%4==0  && i%100!=0 || i%400==0)
			return "윤년";
		else
			return "평년";
	}

	

}
