package javasds;

import java.util.Arrays;

public class Two차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2차원 배열 (복층 아파트)
		// c#에서는 [][] , [ , ] 이렇게 2종류가 있다 
		
		int [] [] jeongsoo = new int[2][3]; // 2층 3호 짜리 배열이다  (2행 3열)
		
		jeongsoo [1] [0] = 100;
		jeongsoo [1] [2] = 78;
		
		int [] [] bae = new int [2] [3];
		
		// int [] [] bae1 = {10, 20, 30, 40, 50, 60}; // 이렇게 작성하는건 아닌다 
		int [] [] bae1 = {
							{10, 20, 30}, 
							{40, 50, 60}
						}; // 이렇게 묶어야 한다 // 모든 메모리는 2차원으로 안잡히고 1차원으로 잡힌다 
											// 그래서 2차원 할때 짤라서 잡아야 한다 
		
		
		for (int i = 0; i < bae1.length; i++) {	// 1차원 일때는 배열 숫자만 쓰면 된다 
            for (int j = 0; j < bae1[0].length; j++) { // 2,3차원 배열에서는 행과 열의 길이가 달라서 알맞게 추가 작성을 해야한다 
                System.out.print(bae1[i][j]+"\t");
            }
         
		System.out.println();
		}
	}

}
