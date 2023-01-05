package javasds;


class Parent {
	protected int diamond; // 접근 지정자 - 상속간에만 사용한다 
	public void don() { 
		System.out.println("나 돈 많아 ");
	}
} //Parent-en

class Child extends Parent{
	//diamond 선언 x don() 선언x
	
	public void car() {
		diamond = 3; // 사용가능 //다이아몬드를 위에서 선언을 했으니 여기서도 추가하면 안된다 
		System.out.println("나 중형차 있어");
	}
}// child - end

public class 상속1 {

	// TODO Auto-generated method stub
			//상속 
			//앞에 있는걸 끌어다 쓰는거다 
			// 1. 상속은 100% 상속이다 
			// 2. 자녀의 재산은 부모와 같거나 많다
			// 3. extends (is a kind of)
			//	예) 물고기 	extends  동물
		
	


public static void main(String[] args) {
		
	Parent p1 = new Parent();
	p1.don();
	//p1.car() // 이건 안됨 
	
	Child c1 = new Child();
	c1.don(); // 상속을 받았으니깐 사용가능 
	c1.car();
		
	}

}
