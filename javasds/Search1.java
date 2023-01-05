package javasds;

import java.util.Arrays;

public class Search1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 검색 (search)
		
		// 검색로직 // 등수로직 (착각깨몽) 
		// 1. 순차검색 - sequence search
		  // (1 + 100) /2 => (n+1)/2 
		
		int [] soo = {100, 120, 50, 120, 70}; // 초기치 
		
		int cnt = 50; // 찾는수 //break 포함 안한 이유 중복이 있을 까봐 
		
		
			for(int i=0; i< 5;i++) {
			
				if(soo[i]==cnt) { // 중복수가 있는 경우 
		                System.out.println(cnt+ ":" + i + "번째에 있습니다!");
		                
//		                int cnt = 1;
//		                for(int i=0; i<su.length;i++) {
//		                        if(su[i]==50) {
//		                                System.out.println(cnt+"번째에 있습니다!");
//		                        }
//		                        cnt++;
//		                }
		        }
		      
		}
			
			// 2. binary search(2진 검색)
			
			// log N + 1 = X   2 ^ x = N
			//    2
				// log 1000 = 3 ==> 10^3 = 1000
			
				//	2^6 = 64 < 2 ^ x = N = 100  < 2 ^ 7 = 128 //데이터값이 100개면 값은  7 
			
			int [] arr =  {11,84,45,78,34,9,2};
			
			//sort 안되어 있으면 sort하고 
			Arrays.sort(arr); // 2 9 11 34 45 78 84  // 2진검색 가능 
			
			//78은 몇번째? 
			System.out.println("78은 " + Arrays.binarySearch(arr, 78) + " 번째에 있다");
			
			
			System.out.println("70은 " + Arrays.binarySearch(arr, 70) + " 번째에 있다"); // 목록에 없으면 음수 값이 나온다
			
			
			 int jj = 50; //5
			 	if(Arrays.binarySearch(arr, jj)>0) { //값이 있는지 물어보는 문장 
			 		System.out.println("78은 "+Arrays.binarySearch(arr, 78)+"번째에 있다는");
			 		
			 	}else {
			 		System.out.println("그 숫자는 없어유");
}
			
			
			
	}

}
