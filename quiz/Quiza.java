package quiz;

public class Quiza {

	public static void main(String[] args) { //3번째 로직 
		// TODO Auto-generated method stub

		int [] k = {10, 90, 100, 60, 70, 23};
		// int sw = 0; //첫번째구문 밑에다가 쓰면 안된다 
		for(int i = 0; i < k.length -1; i++) {
			int sw = 0; // 두번째 구문 밑에 작성한다 //스위치 끈거 
			for(int j = 0; j < (k.length-1 -i); j++) {
				if (k[j] < k[j + 1]) {

					int imsi = k[j]; 
					k[j] = k[j + 1];
					k[j + 1] = imsi;
					sw = 1; 
				}
				if (sw==0) //한번더 입력 
					break;
			}
		}
		for (int i = 0; i < k.length; i++) { // 반복문 안에서는 i라는 객체를 한번 사용하지만 밖에서는 괜찮다 
			System.out.print(k[i] +"\t"); // nested 기법
			
		System.out.println();
		}
	}
	

}
