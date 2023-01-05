package javasds;

public class While문 {
	public static void main(String[] args) {
		
		/* while문(조건)
		 {
		 
		 문장틀
		 
		 }*/
		
		int i = 1;	//-> 초기치 
		while (i <= 10) {	// ->목적치 
			System.out.println("출력");
			i++; // -> 증가치 
		}
		
		
		int sw = 0;
		int cnt = 0;
		while (sw==0) {
			
			cnt++;
			if(cnt==3) {
				System.out.println("나는 while로 올라간다는");
				continue;
				
			}
			System.out.println("출력");
			if(cnt == 10)
				sw = 1;
		}
	}
}
