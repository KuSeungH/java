package quiz;

import java.util.Scanner;

public class Quiz1 {

	// 점수를 입력 받아 학점을 구하는 자바 프로그램을 작성하시오
	// switch문
// switct(조건) {
	// case 1:
	//		처리할 문장
	//		break;
	// case2 :
	//		처리할 문장
	// 		break;
	// 	default:
	//		처리할 문장
	// 		(break);
	
	// case 100: // 정수 o 실수 x 문자 o 컴마구분x
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 ");
		int kr = sc.nextInt();
		
		System.out.print("수학 점수 ");
		int mt = sc.nextInt();
		
		System.out.print("과학 점수 ");
		int si = sc.nextInt();
		
		double av = (kr + mt + si) / 3;
		
		System.out.println("평점: " + av);
		
		if(av >= 90.0) 
			System.out.println("A");
		else if(av>=80.0) 
			System.out.println("B");
		else if(av>=70.0)
			System.out.println("C");
		else if(av>=60.0)
			System.out.println("D");
		else
			System.out.println("F");
	
		
	}

}
