package javasds;

import java.util.Scanner;

public class 시험 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3 / 5  3/0 = x 0.x=3(불가능 )
		// 0/3 =x 3x= 0 가능
		// 0.0 = x 0.x=0 부정 
		
		try { // 1. 에러날 것같은곳 try로 묶음 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수는 : "); 
		String one1 = sc.nextLine();
		
		int soo1 = Integer.parseInt(one1);
		
		System.out.print("두번째 수는 : ");
		String two2 = sc.nextLine();
		
		int soo2 = Integer.parseInt(two2);
		
		System.out.println(soo1/soo2);
		
		
		
		/*
		  try { }  : 혹시 에러가 날지도 모르는 부분은 block
		  catch {} : 에러 발생시 처리 
		  finally {} : 에러유무에 관계없이 무조건 처리할 부분 
		 */
		// 0이 들어왔을때 에러처리 하라는 글 
		//-------------------------------------------
		} catch(ArithmeticException e) { // 세부적으로 체크할때 // 자녀 : 위에작성해야한다 
			System.out.println("0이 아닌 값으로 입력하라는");
		//----------------------------------------------
			
		} catch(Exception e) { // 2 예외 클라스 , 에러  // 가장 꼭대기 조상 // 부모 : 자녀 아래에 작성으로 해야한다 
			System.out.println("에러났다는 ");
			System.out.println("0이 아닌 두개의 정수를 입력하세요  "); // 에러시 대처방안 
			System.out.println(e.getMessage()); // by zero
			System.out.println(e); // toString()
		//-----------------------------------------------
			
			// 생략 가능 
		} finally { // 3 처리 
			System.out.println("여기는 무저권 한다는~~~"); // very good
			// db 접속 안함 network접속 안함 (대비)
			
			// try chath 가 없으면 에러났을때 컴퓨터가 시스템자동으로 에러를 표시하는데  try chath 있으면  컴퓨터가 chath한테 넘겨줘서 	System.out.println("에러났다는 "); 이문장을 내보내 준다 
		
		}
		// 오라클 에러는 전부 에러숫자로 나타낸다  // C언어 erron 4096 => file not find 
		// java는 message에서 getMessage
		
		/*
		 번째 수는 : a
		에러났다는 
		0이 아닌 두개의 정수를 입력하세요  
		For input string: "a" =>System.out.println(e.getMessage());
		java.lang.NumberFormatException: For input string: "a" => System.out.println(e);
		여기는 무저권 한다는~~~ => getMessage
		 */
		
		// throw 또는 throws = (try-chath) 와 같다 
		// chath vs throw = 둘다 에러 처리하는거가 하지만 chath 직접 처리하는거 throw는 보내는거다 
		// chath이후에 뭔가 필요하면 쓰고 없다고 하면 throw를 사용한다 
	}
}
