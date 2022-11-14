package quiz;

public class Quiz9 {

	public static void main(String[] args) { // 소트 1번째 방법
		// TODO Auto-generated method stub
		
		// int [] k = {10, 90, 100, 60, 70, 23};
		// 위 k배열을 점수 내림차순으로 소트하시오 
		
		// 10 			(0,1) (1,2) (2,3) (3,4) (4,5) 
		// 23 			(0,1) (1,2) (2,3) (3,4) (4,5) 
		// 60 			(0,1) (1,2) (2,3) (3,4) (4,5) 
		// 70 			(0,1) (1,2) (2,3) (3,4) (4,5)
		// 100, 90 		(0,1) (1,2) (2,3) (3,4) (4,5)
		// i는 밑으로 j는 옆으로 
		
		int [] k = {10, 90, 100, 60, 70, 23}; // 배열의 길이가 6이다 : k.length
		// for(int i = 0; i < 5; i++) {
		for(int i = 0; i < k.length -1; i++) {
			
			// for(int j = 0; j < 5 ; j++) { // 전부다 소트하는거 
			// for(int j = 0; j < 5 - i; j++) { // 구해진건 제외하고 소트 하는거
			for(int j = 0; j < (k.length-1 -i); j++) { //외울때 이 방법으로 외운다 
				
				
				if (k[j] < k[j + 1]) { // 앞에있는게 크면 바꿀 필요는 없다  두개가 같은 경우도 바꿀 필요없다 
					
					int imsi = k[j]; //swap 지그제그 기법 사용  지그제그가 없으면 이미 소트가 끝났다
					k[j] = k[j + 1];
					k[j + 1] = imsi;
					
				}
				
			}
		}
		for (int i = 0; i < k.length; i++) { // 반복문 안에서는 i라는 객체를 한번 사용하지만 밖에서는 괜찮다 
			System.out.print(k[i] +"\t"); // nested 기법
			
		System.out.println();
		}
		
		// swap (바꾸기) 
		
//		int aa = 100;
//		int bb = 200;
//		
//		// aa = bb;
//		// bb = aa; // 이렇게 되면 각각 200이 된다 이럴때  임시 방을 하나 더 만들어서  해결한다 
//		
//		int imsi = aa;
//		aa = bb;
//		bb = imsi;
//		
//		int imsi = bb; // 먼저 임시 먼저 작성하고 맨 왼쪽으로 끌고와라 
//		bb = aa;
//		aa = imsi;
		
		
	}

}
