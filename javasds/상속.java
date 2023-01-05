package javasds;


public class 상속 {

	
		

			// 상속 
		// 부모 (color, door)
		//  이렇게 객체를 이어 받는걸 상속이라 한다 
		// 자녀 (+ 배기량 ..)
		
		// overloading(매소드 중복) 	vs  overriding (재정의 단, 성속에 있어서)
		
		// 출력전문 매소드 chool() 
		// toString() to 다음으로 나오는건 목적이다 = 문자로 바꾸는 매소드 
		private String color; //속성,필드
        private int    door;
		
        // 매서드2형식정의문 형식 => 생성자 (이름은 class명과 같고)
        // 앞에 public있고 void, 반환형(return)은 없다 
    	// 이름은 같고 객체가 중이여서 overloading 이다 (생성자 중복 )
		public 상속(String color, int door) { // 매서드 2형식 자동으로 만들어줌  수정가능 //mycar1
			
			// TODO Auto-generated constructor stub
			
			this.color = color;
			this.door = door;
		}

		public 상속() { //mycar //default constructor 생성자가 숨어있다가 나온거다 
		
			// TODO Auto-generated constructor stub
		}

		public String getColor() {
             return color;
     }

     public void setColor(String color) {
             this.color = color;
     }

     public int getDoor() {
             return door;
     }

     public void setDoor(int door) {
             this.door = door;
     }

     public void drive() {//메소드
      System.out.println("멋지게 드라이브하자는~~~");
             
     public String toString() { // 문자열 처리 메서드 // 매서드 3형식 정의문 형식 
    	 return "자동차 색은 " + color + " 이고 , 문의 갯수는 " + door;
     }
     
}


public static class CarClassKaja0 {

     public static void main(String[] args) {
             // TODO Auto-generated method stub
             
             //제작, 생성
     	상속 mycar=new 상속 (); //생성만
     	
     	mycar.setColor("red");
     	mycar.setDoor(4);
     	System.out.println(mycar.getColor() + "\t" + mycar.getDoor());
     	System.out.println(mycar.toString());
     	System.out.println(mycar); //toString을 생략 가능 단 toString이 있어야 생략 가능하다 
     	
     	// 객체생성 + 초기치 
     	상속 mycar2=new 상속 ("blue", 2);//앞에 상속 mycar2=new 없으면 2형식 메서드문 
     	
       
     }
	}

}
