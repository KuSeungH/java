package quiz;

import java.util.Scanner;

public class Quiz1a {

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
		
		System.out.print("점수는?");
		
		int jum = sc.nextInt();
		
		// 80-89, 정수/ 정수= 정수 ==> 1-로 나눈 몫이 8로 같다 
		int mok = jum / 10;  // 93 / 10 ->9 98/10 -> 9
		
		switch(mok) { //head
		
		case 10 : 	// body // 100일 경우 
			System.out.println("A"); // 100
			break; // exit
			
		case 9 : // 90-99
			System.out.println("A");
			break;
			
		case 8 : //80-89
			System.out.println("B");
			break;
			
		case 7 : // 70-79
			System.out.println("C");
			break;
			
		case 6 : // 60-69
			System.out.println("D");
			break;
			
		default :
			System.out.println("F");
			break;
		}
		
		
		
	}

}

