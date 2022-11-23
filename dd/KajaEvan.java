package dd;

public class KajaEvan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 수학에서  + - * / 	10 % 3 
		// if() 1형식 2형식
		// 1형식 : if(조건) {
			// yes
		// }
		
		if(5>3){
			System.out.println("맞네");
		}
		
		if(5<3){
			System.out.println("작네");
		}
		else
		{
			System.out.println("크네");
		}
		// 13이 짝수냐? 
		// 짝수란 ? 2의 배수
		// == (같냐) !=(같지않다)
		if(13%2 == 0) {
			System.out.println("짝수네");
		} else
		{
			System.out.println("홀수구만");
		}
		
		//15가 3의 배수 인지, 5의 배수인지, 3과 5의 동시배수인지 구하는 자바 프로그램을 작성 
		// 산술연산자 + - * / 
		// 관계연산자 == =! < > <= >=
		// 논리연산자 && || !
		// 다중if 중첩if 
		
		
		if(15 % 3 == 0) {
			System.out.println("오예");
		}
		
		if(15 % 5 == 0) {
			System.out.println("거봐");
		}
		
		if(15 % 3 == 0 && 15 % 5 == 0){
			System.out.println("nice");
		}
		
		if(15 % 3 == 0 && 15 % 5 == 0) 
			System.out.println("nice");
		 else if(15 % 3 == 0) 
			System.out.println("오예");
				 else if(15 % 5 == 0 ) 
					System.out.println("거봐");
		
		
	}

}
