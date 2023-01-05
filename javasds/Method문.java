package javasds;

public class Method문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메서드 호출문 - 사장 //메서드 정의문 - 비서 
		// 소트 (50줄)  미리 만들어서 필요 할 때 호출에서 사용 할 수 있다 
		
		// 소트 
		
		// 소트 
		// 메서드는 매인 밖에서 만든다 // 정의문 끼리는 위치크게 상관 없다 
		
		joonbi(); // 호출문 예시 // 메서드 1형식  (같다가 바로 그냥 처리하고 오는거)
		System.out.println("준비는 끝"); 
		cheori("햄", 3200); // 메서드 2형식 (뭘 주고 받는거)
		String bada = mammoori(); // 메서드 3형식 (출발 했던문장을 지우고 들어간다)  
		System.out.println(bada);
	}

	private static String mammoori() { // 2. void를 문자면 String 숫자면 int로 바꾼다
		// TODO Auto-generated method stub
		System.out.println("식사후 분리수거중 ");
		return "분리수거 "; // 1. 하나밖에 안된다 
	}

	private static void cheori(String jaeryo, int don) {
		// TODO Auto-generated method stub
		
		System.out.println("오늘 식사는 " + jaeryo + " 이고 가격은" + don + " 입니다 " );
		
	}

	private static void joonbi() { // 메서드 정의문 
		// TODO Auto-generated method stub
		
		System.out.println("음식만들기위해 그릇 등 준비중");
	}

}
