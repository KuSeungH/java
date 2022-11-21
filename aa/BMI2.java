package aa;

import java.util.Scanner;

public class BMI2 {
	public static void main(String[] args) {
		
		// 키와 몸무게를 각각 변수에 넣은후 Scanner 사용
		// C언어 : 출력 printf, 키보드 입력 scanf
		// Java : 출력 sysout, 키보드 입력 -Scanner 클래스 -File -GUI JOPtion
		// print 줄바꿈 println 줄바꿈 없음 
		
		// double ki = 1.80;
		// int mom = 78;
		// double bmi = mom / (ki * ki);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키는 ");
		int ki = sc.nextInt();
		
		System.out.print("몸무게 ");
		int mom = sc.nextInt();
		
		double mki = ki / 100.0;
		double bmi = mom/ (mki * mki);
		
		System.out.println("비만도: " + bmi);
		
		if(bmi >= 30.0) 
			System.out.println("비만");
		else if(bmi>=25.0) 
			System.out.println("과체중");
		else if(bmi>=20.0)
			System.out.println("보통");
		else
			System.out.println("저체중");
		
	
		
		
	}
}
