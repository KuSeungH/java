package javasds;

// class AA {} // 재산은 없고 껍대기만 있다 

// class CC {}

// class BB extends AA, CC{} // 이건 AA로부터 상속받고 CC로도 상속 받고 싶다 // 하지만 다중 상속은 안된다 //다중상속 문제  
//extends 상속받는다는 뜻

interface CC {} // interface는 클레스가 아니다 //다중상속이구나라고 판단 

class AA {}

class BB extends AA implements CC{} 


public class 다중상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 다중상속 
		// diamond problem 
	}

}
