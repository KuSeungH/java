package javasds;

import java.util.Stack;

public class 스택 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  Stack에 음식이름 3개정도를 generic 으로 넣고
		  다시 꺼내어 출력하는 프로그램을 작성하시오 
		 */
		
		// Depth First Search
		Stack <String> st1 = new Stack <String>();
		
		st1.push("카레");
		st1.push("볶음밥");
		st1.push("뚝불고기");
		System.out.println(st1.size());
		
		System.out.println(st1); // stack 내용 출력
		// [카레, 볶음밥, 뚝불고기]
		
		System.out.println("====== pop으로 출력");
		
		while(!st1.isEmpty())
			System.out.println(st1.pop());/// 뚝불고기 볶음밥 카래 
		
		System.out.println(st1); // stack내용 출력 
		//[]
	}

}
