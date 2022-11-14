package quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중식선택입니다 
		
		//1 짜장
		//2 짬뽕
		
		// 	선택하시오(1-2) 3
		
		// 메뉴가 다시 나온다 
		
		// 1 짜장
		// 2 짬뽕 
		
		//  선택하시오(1-2)2
		
		// 맛있게드세요 
		
		Scanner sc = new Scanner(System.in);
		int key;
		
		do {
			System.out.println("중식선택입니다");
			key = sc.nextInt();
			
			switch (key) {
			
			case 1: 
				System.out.println("1. 짜장");
				break;
				
			case 2: 
				System.out.println("2. 짬뽕");
				break;
				
			default :
				System.out.println("다시 고르세요");
				break;
			}
		}while (key != 0);
		System.out.println("맛있게 드세요");
		
	}

}
