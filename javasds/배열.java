package javasds;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 : 기억창고를 한꺼번에 접어주는 것 (콘도, 아파트....)
		// 고정길이 배열, one data type
		// kot = kor + eng + mat + soc + sci + .... art+ music
		// 배열은 index(첨자, 호수)
		// jum apt(배열)
		// index 는 0호 부터 시작 
		// int jum[] = new int [10]; // 위 아래 같은 말인데 아래 쪽을더 숙달하자 
//		 int [] jum = new int [10]; // 1차원 배열 (단층 아파트)
//		 jum[0] = 100;
//		 jum[1] = 80;
//		 jum[9] = 78;
		 // jum[10] = 100; 
		 
	
		int [] jum = {100, 80, 98, 55, 100};
		// int tot = jum[0] + jum[1] + jum[2] + jum[3] + jum[4];
		
//		int sum = 0;
//		for(int i = 0; i <=4; i++) {
//			sum = sum + jum[i];
//			
//		}
//		
		int sum = 0;
		for(int i = 0; i < jum.length; i++) { //배열의 길이 : 배열의 대표명 .length
			sum = sum + jum[i];
			
		}
		
		double avg = sum / 5.0;
		
		System.out.println("총점은= " + sum + " 평점은= "+ avg);
		
		System.out.printf("총점= %d 평균= %.2f\n", sum, avg); 
		// 원래 소수점이 없으면 %f
		

	}

}
