package javasds;

// 인터페이스 
// 1. 다중상속이 가능 2. 함수의 원 3. 협업에서 필요하다 
interface GreandFather {
	void isCamoingCar();
}

interface Komo { // 인터페이스는 대충 설계도 
	//선언은 가능한데 구현을 못한다 	
	void isAirPlane(); // 선언가능 구현 안됨 child에서 구현 
	
}

class Samchon {
	public void isBoat() {
		System.out.println("보트 여행 다니자~~~~~~");
	}
}

class Na extends Samchon implements Komo, GreandFather{ // 인터페이스 끼리는 (,) 사용이 가능하다 
	public void isCar() {
		System.out.println("드러아브 가자~~~~~~");
	}

	@Override
	public void isAirPlane() {
		// TODO Auto-generated method stub
		System.out.println("비행기 여행 다니자~~~~");
	}

	@Override
	public void isCamoingCar() {
		// TODO Auto-generated method stub
		System.out.println("캠핑 여행 다니자~~~~~~");
	}
}

public class 다중상속2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Na na1 = new Na();
		na1.isBoat();
		na1.isCar();
	}

}
