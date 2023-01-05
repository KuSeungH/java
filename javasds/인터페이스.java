package javasds;

import java.util.LinkedList;
import java.util.Queue;

public class 인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		collection 인터페이스 
//		—> Queue(큐) 인터페이스 —> 상속받아 만든 LinkedList클래스 
//		LinkedList <String> q2 = new LinkedList <String>(); (o) 
		
		Queue <String> q1 = new LinkedList<String>(); 
		
		// 키보드 입력, 네트워크접속객체(기본5명...) 그 이후는 대기 (콜센터)
		// 버스대기열 
		
		// fifo : first in first out
		// lilo : last in last out
		
		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");
		
		System.out.println(q1.size()); //3
		
		System.out.println(q1); // queue 내용 출력 
		// [바보, 온달, 평강공주]
		
		// 카카오지하철 - 최단거리 - 자료구조 그래
		
		// 하노이타워 - 재귀적 호출 - stack(20)
		/// 1! + 2! ........10!
		// n * (n + 1)  * ........ 
		
		// 값이 들어있어?????
		if(!q1.isEmpty()) // q1이 비어있지 않나??? // underflow
			q1.poll(); //바보 꺼내는 메서드 
		if(!q1.isEmpty())
			q1.poll(); // 온달이 나간다 
		q1.offer("홍길동"); // 퍙강공주 뒤에 이어서 홍길동이 있다는 
		
		System.out.println(q1); // 평강공주 홍길동 
		
		// DFS vs BFS (breath first seach)
		// BFS : queue
		// DFS : stack
	}

}
