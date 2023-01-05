package javasds;

// 결과적으로 
// 일반 클래스 --> 추상클래스 
abstract class Kwail { //abstract 추상 abstract를 class 앞에 추사 
	public void good() {
		System.out.println("먹으면 좋아");
	}
	// 추상매소드도 추가 
	abstract void mukja(); // 추상매서드가 있으면 추상클래스 
	// 구현 안하고 선언은 한다, 구현은 자녀쪽에서 한다 
	// interface(대충설계도) 와 abstract 는 사촌간 이다 (이거는 그나마 조금 상세한 설계도)
	
} // Kwail - end 
// 과일(가독성, 다형성)
// 사과 배 감 

class Sakwa extends Kwail{

	@Override
	public void mukja() { // 구현 
		// TODO Auto-generated method stub
		System.out.println("사과를 사각사각 먹자 "); //이것이 다형성 
	}
	// 가독성 
}

class Bae extends Kwail {

	@Override
	public void mukja() {
		// TODO Auto-generated method stub
		System.out.println("배는 잠수함 모양으로 꺽어 목자 ");
	}
	
}
// 다향성 (polymorphism) : 그리스어, many forms

class Kam extends Kwail {

	@Override
	public void mukja() {
		// TODO Auto-generated method stub
		System.out.println("감은 꼭지 때고 맛있게 먹자는~~");
		
	}
	
}
public class 다중상속3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Kwail k1 = new Sakwa(); // 객체의 형변환 
	k1.mukja(); // 사과 먹는다  // 다형성 
	
	Kwail k2 = new Bae();
	k2.mukja(); 
	
	Kwail k3 = new Kam();
	k3.mukja(); 

	}

}
