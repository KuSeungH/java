package quiz;

import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자 3 경우 말고 문자A 까지 눌러도 메뉴가 다시 나오도록 작성하시오 
		
		// "A" ==> nextInt ==> next()
		// "1" "2"
		
Scanner sc = new Scanner(System.in);
		
		String bada;
		
		do {
			System.out.println("1짜장");	//화면 출력 
			System.out.println("2짬뽕");
			System.out.println("선택 (1-2)");
				bada=sc.next(); // 키보드로 문자까지 입력 "1" "2" A"
		}while (!bada.equals("1") && !bada.equals("2")); // 1 or 2 의 반대 
							// ==> !1 and !2
		
		System.out.println("맛점하세요"); // 1 or 2
	}

}
