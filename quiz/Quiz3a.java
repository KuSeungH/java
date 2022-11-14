package quiz;

import java.util.Scanner;

public class Quiz3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int bada;
		
		do {
			System.out.println("1짜장");	//화면 출력 
			System.out.println("2짬뽕");
			System.out.println("선택 (1-2)");
				bada=sc.nextInt(); // 키보드로 정수입력 
		}while (bada !=1 && bada !=2); // 1 or 2 의 반대 
							// ==> !1 and !2
		
		System.out.println("맛점하세요"); // 1 or 2
		}

}
