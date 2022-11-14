package quiz;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 규칙을 먼저 찾아야 한다 
		// 규칙 2번째 규칙을 모르면 일단 비워둬라 
//      행  5  열 1,2,3,4,5
//		*
//		**
//		***
//		****
//		*****
		
		for (int h = 1; h <=5; h++) {
			for (int y = 1; y <= h; y++)
				System.out.print("*");
				
				
			System.out.println();	
		}
		System.out.println();	
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
