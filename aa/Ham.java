package aa;

import java.util.Arrays;
import java.util.Scanner;

public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "apple";
		String mitjool = "_____";
		
		//char [] ch1 = {'a', 'p', 'p', 'l', 'e'}; //문자상수배열 
		// char [] mitjul = {'_', '_', '_', '_', '_'};
		
		// - - - - - 
		
		String[] str = {"a","p","p","l","e"}; //문자열배
		String[] strLine = {"_","_","_","_","_"};

		// 초기치 작업인데 사실 프로그램 작성시에는 먼저 쓰지 않음 
				String ip;
				// int cnt=0;
				int sw = 0;
				// count와 flag기법 
				
				
		// 처음에 jool (밑줄) 출력- // nested 기법
		for(int i=0; i<strLine.length; i++) {
		System.out.print(strLine[i]+" ");
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 13; i++) { // 13-for-start
			// cnt = 0;
			System.out.println("예상글자입력:");
			ip=sc.next();	// nextLine() // i love you
			for(int j = 0; j<=13; j++) {	// 맞추어있으면 밑줄 지우고 대신 해당 문자를 아래오 
				if(ip.equals(strLine[j]))// 내용비교 
					str[j] = strLine[j]; // 영문자를 밑줄로 내려보냄 
			}
			/* a p p l e ==> 문자 배열 
			 
			 a p p - - ==> 줄 배열  */
			
			for(int j = 0; j < 5; j++)
				System.out.println(strLine[j]); //시작하자마자 p를 입력하고 맞추었으니 _pp__
			
			System.out.println("\t" + i + "번시도"); //1번시도 
			
			// 배열 통채로 비교 
			// if(aa>3) {
			if(Arrays.equals(str, strLine)) {// true?
				System.out.println("참잘했어요");
				sw=1; // 13번째 까지 계속 진행 한후 결과 보기
				break; // 반복문을 빠져 나오는 것으로 13 - for - end 다음으로 exit
			}
		} // 13 - for - end
		
		// 13번 시도후 오답일 때, for문 나오기전 정답 
		if(sw==0) //
			System.out.println("다음기회에");
	}//main - end

}	// class - end
