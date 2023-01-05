package javasds;

import java.util.Arrays;


public class COmeBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] bae = {10, 90, 100, 60, 70};
		
		// 오름차순
		
		Arrays.sort(bae); // bae: 배열의 대표명 // 이게 원래 자바의 소트 
		
		for (int i = 0; i < bae.length; i++) { 
			System.out.print(bae[i] +"\t"); 
			
		System.out.println();
		
		// 내림차순은 준비가 안되어 있다 찍을 때 거꾸로 찍어야 한다 
		
		// 내림차순 
	}
		for(int i = bae.length -1; i >=0; i--) {
			System.out.print(bae[i] + "\t");
			
	
			System.out.println();
		}
		

	}
}
