package quiz;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//			학년 			 반
//			1		-	 1
//			1		-	 2
//			2		-	 1
//			2		-	 2
//			3		-	 1
//			3		-	 2
		
		// 다중 for문(중첩 for문)
		// 모든 반복문에서 중첩 for문을 쓸때 빨리 변하는 것이 안쪽으로 입력한다 
		
		System.out.println("학년 " + "  반");
		for (int i = 1; i <= 3; i++) { // 학년 
			for (int l = 1; l <= 2; l++ ) {	// 반 
			System.out.println(i + "  -  " + l);
			}
		}
		
		// System.out.println(i + "\t" + l); // C언어에서는 4 하고 3이 찍히지만 Java에서는 에러가 뜨면서 안찍힌다 
	}

}
