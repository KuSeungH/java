package javasds;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// atof()	atoi() 	atol()
		// method overloading(함수 중복)		vs overriding(재정의)
		
		// ==> 가족성 
		//kaja(30); // 30을 인자, argument
		kaja(50.5);	
		kaja(30);
	}
	
	// 메서드 오버로딩조건
	// 1. 메서드 이름이 같아야 한다 
	// 2. 인자의 갯수가 다르거나 인자의 타입이 달라야한다 
	

	

	private static void kaja(float i) { //i : 매개변수, parameter
		// TODO Auto-generated method stub
		
		// System.out.println("나 float 이야" + i); // 30.0으로 출력 
		System.out.println("나 float 이야" + i);
		
	}

	private static void kaja(double i) { 
		// TODO Auto-generated method stub
		
		System.out.println("나 double 이야");

	}

}
