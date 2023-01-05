package javasds;

import java.util.HashMap;
import java.util.Set;

public class 키벨류사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// key,value 사용, hashing기법으로 빠른 검색
		
		HashMap <Integer,String> hm1 = new HashMap<Integer, String>();
		
		System.out.println(); // 0
		
		// wrap
					// KEY(Integer) // VALUE(String)
		hm1.put(new Integer(100), "멋쟁이"); // hashcode
		hm1.put(new Integer(300), "공주");
		hm1.put(new Integer(200), "왕자");
			// add
		
		// KEY
		System.out.println(hm1.get(300)); //value출력 
		/*
		  String s1 = hm1.get(300);
		  System.ou.println(s1); 이 두줄을 위 한줄로 줄인거다 
		 */
		
		//###### key-value출력-1
		
			// =====key 모음 (출력)
		Set <Integer> s1 = hm1.keySet();
		
		// System.out.println(s1);
		
		//(이소스애서 s1은 key 집합, 100,200) / 즉, 앞에있는 s1을 사용
		for(Integer i : s1) {
			System.out.println(i + "\t" + hm1.get(i));
								// key 		// value
			
		}
		//100 멋쟁이 
		//200 왕자 
	}

}
