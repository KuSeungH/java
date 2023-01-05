package javasds;

public class 객체와클레스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스와 객체 
		
		// 절차형 언어 C언어 
		// 객체지향 언어 Java...
		
		// 객체 :사물 
		// OOL: object oriented language
		// OOP: object oriented programming
		
		// oop 작성순서 
		
		//1. 설계도 그리기 
		// - class 로 만든다 
		class Car{
			String color; //성격 특징 // 속성이 들어감 (field)
			int door;
			void drive() { // 행동 // method 메서드라고 한다 
				System.out.println("드라이브 할꺼야"); // 뭔가를 하는거 
			}
		}
		// instance 클레스로 만들어지 결과물 
		
		//2. 제작
		// 자바에서 제작한다는 말은 메모리로 가지고 제작을 한다는 말 
			
		// new Car();  // 이렇게 작성하면 문제는 직접적으로 찾아가는건 괜찮은데 그 이외에는 기억 창고가 있어야 한다 
		Car myCar = new Car(); // 객체의 위치를 알고 있다 (객체참조변수)
		
		
		//3. 사용
			// 3-1. 객체(참조변수).속성 = 값
		myCar.color = "white"; // 주로 값을 집어 넣을 때 사용
		myCar.door = 2;
		
		   // 3-2.  객체(참조변수).메서드();
		myCar.drive(); // 행동할때 사용한다 
		
		  // 3-3. 객체(참조변수).속성
		System.out.println(myCar.color); 
	
	}

}
