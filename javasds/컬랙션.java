package javasds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 컬랙션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		배열과  Collection 의 차이점 
//		배열 : 고정길이 배열(늘이거나 줄일수거 없다), one data type
//		컬랙션 : 가변길이 배열(늘렸다 줄였다 할수 있다), multi data type  
//		ㄴ generic (one data type, 가변길이 배열)
		
		// 컬랙션 List 종류 => 순번이 있다 (가변길이) 
		ArrayList alist = new ArrayList();	// 길이는?

		System.out.println(alist.size()); // 현제길이는 0 //컬랙션은 length는 안됨
		alist.add("ondal"); //첫번째칸 
		alist.add(10);	// 두번째칸
		alist.add(3.14); //	 세번째칸
		
		for(int i = 0; i < alist.size(); i++)
			System.out.println(alist.get(i));
		
		// ArrayList <int> alist = new ArrayList<int>(); // 여기에 정수형만 입력!
		// <> 의 의미는 generic
		// Integer는 int class화 한거다 (wrapper)
		ArrayList <Integer> alist2 = new ArrayList<Integer>();
		alist2.add(3); // 실수는 입력 안됨
		alist2.add(100);
		
		for(int i = 0; i < alist2.size(); i++)
			System.out.println(alist2.get(i));
		
		
		
		// 문자열을 섞는 문법, colloction과 콜라보  
		
		String [] bae = {"babo", "ondal", "kongjoo", "satto", "choonhyang"}; //배열 
			// 한컴 타자연습 
		// 배열 -> 컬랙션으로 살짝변경 
	List <String> list1 = Arrays.asList(bae); // 컬랙션화 
	
	Collections.shuffle(list1 ); // 섞어
	
	// for: 초기치 목적치에 많이 쓰임 // 뒤에서 부터 한개씩 끄집어 낸다
		for(String hana : list1) {
			System.out.println(hana);
		}
		
	} // main - end

} //class - end

