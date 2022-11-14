package quiz;

import java.util.Scanner;

public class Quiz2 {

	// 매월의 날짜수를 출력하시오 12번 안물어보고
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("날짜 수는?");
		
		int day = sc.nextInt();
		
		
		switch (day) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
			break;
		
		case 4: case 6: case 9: case 11: 
			System.out.println("30일");
			break;
		
		default :
			System.out.println("28일");
			break;
		
		}
		
	}

}
