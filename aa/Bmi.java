package aa;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BMI 프로그램을 작성하시오 
		// 몸무게 / 미터 키의 제곱 
		// BMI가 30 이상이면 비만 
		// BMI가 25<= x < 30 과체중
		// BMI가 20<= x < 25 보통 
		// BMI가 20미만 저체중
		
		// 기본 변수 
		// 메모리구분 
		// 1. code memory 2. stack memory 3. static memory 4. heap memory
		// int 정수  double 실수  byte, long => 정수형
		// primitive 
		// int : -2147483648 ~ +2147483647
		// short : -32768 ~ +32767
		// byte : -128 ~  +127
		// long : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
		//double sal  = 300000.0;
		// float sal = 50000.0;
		// boolean aa= false; //true;
		// char ch1= '강';
		
		// hint 
		// int ki = 180;
		// int mom = 78;
		
		// casing
		// 1. pascal casing : BreadKab 
		// 2. camel casing  : ki, my BreadKab
		// 3. snake casing	: my_bread_kab
		
		
		double ki = 1.80;
		int mom = 78;
		double bmi = mom / (ki * ki);
		
		System.out.println("bmi=" + bmi);
		
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
