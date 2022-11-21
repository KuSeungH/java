package aa;

import java.util.Scanner;

public class Bmi3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키는 ");
		int ki = Integer.parseInt(sc.next());
		
		// next() : i 한글자만 
		// nextLine() :  I love you 한줄 
		// String 문자만 출력 
		
		System.out.print("몸무게 ");
		double mom = Double.parseDouble(sc.next());
		
		
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
