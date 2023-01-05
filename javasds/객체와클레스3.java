package javasds;

//캡슐화(encapsulation) : 정보은닉 , 속성 + 메서드 
// 접근지정자 (access modifier)

// 1. private : class 내부에서만 접근할 수 있다 
// 2. public : class 외부에서도 접근이 가능하다 
// 3. default : (앞에 아무것도 안씀 )  String color // package 안에서는 가능 
// 4. protected	: 상속간에만 사용 
class Car{
	private String color; 
	private int door;
	
	public void drive() { 
		System.out.println("드라이브 할꺼야"); 
	}
	
	public void setColor(String color) { // setter 도우미 
		this.color = color; //this 자기 자신을 참조하는 객체 =>car 클래스 안에 있는 color
		
	}
	
	public String getColor() { // getter 꺼내주는 도우미 
		return color;
	}
	
	public void setDoor(int door) { 
		this.door = door; 
		
	}
	
	public int getdoor() { 
		return door;
	}
	
} // 설계
public class 객체와클레스3 {

	public static void main(String[] args) { //설계도를 보고출력을 하려면 main안에 작성 
		// TODO Auto-generated method stub
		
		Car myCar = new Car(); //제작 
		
		//사용 
		// myCar.color = "white"; 
		myCar.setColor("white");
		
		// myCar.door = 2;
		myCar.setDoor(2);
		
		myCar.drive();
		
		// System.out.println(myCar.color); 
		System.out.println(myCar.getColor() + "\t" + myCar.getdoor());
		// System.out.println(myCar.door); 
		
	}

}
