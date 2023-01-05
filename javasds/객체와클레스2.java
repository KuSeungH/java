package javasds;

// 캡슐화(encapsulation) : 정보은닉 , 속성 + 메서드 

class Car{ 
	String color; 
	int door;
	void drive() { 
		System.out.println("드라이브 할꺼야"); 
	}
} // 설계도 완성  

public class 객체와클레스2 {

	public static void main(String[] args) { //설계도를 보고출력을 하려면 main안에 작성 
		// TODO Auto-generated method stub
		
		Car myCar = new Car(); //제작 
		
		//사용 
		myCar.color = "white"; 
		myCar.door = 2;
		
		myCar.drive();
		
		System.out.println(myCar.color); 
		System.out.println(myCar.door); 
		
	}

}
