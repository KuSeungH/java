package javasds;


//overriding 
class Parent1 {
	public void car() {// 2. 메서드이름이 같아야 
		System.out.println("부모차타고 드라이브 하자 ");
	}
}

class Child1 extends Parent1 { // 1. 상속에 있어서 
	public void car() {
		System.out.println("자녀차 타고 여행가자 "); // 3. 업글 
	}
	//overriding (재정의)
	// 1. 상속에 있어서 메서드 이름이 같아야한다 
	// 2. 자녀는 부모보다 업그레이드 되어야 한다 
}


public class 객체상속 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 상속 용어
		// 부모객체 Parent, Base 기본 
		// 자녀객체 Child, Derived 파생객체  
		
		Parent1 p1 = new Parent1();
		Child1 c1 = new Child1();
		
		p1.car(); // 드라이브 
		c1.car(); // 여행
		
		// 자료의 형변환 
		// short aa =10;
		// int bb = aa ;
		// short cc = (short)bb;
		
		// 객체의 형변환 
		// Parent p2 = c1;
		Parent1 p2 = new Child1(); //에러가 안난다 
		
		
		// Child c2 = p1
		// Child c2 = new Parent(); //에러가 난 이유 계산이 잘못되었다 재산의 오류 
		
		Child1 c3 = new Child1();
		Parent1 p3 = c3;
		
		Child1 c5 = (Child1)p2; //이렇게 작성하는게 맞다 , 형변환 
		// Child c5 = p2; //에러가 판단한 이유는 부모 자식 객체가 반대로 되어있었다 
		// Child c5 = new Child();
		
		// Child c7 = (Child)p1; // new Parent(); //이거 에러이다 
		// compile o, run x
	}

}
