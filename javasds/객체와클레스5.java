package javasds;

public class 객체와클레스5 {


		 private String color; //속성,필드
	        private int    door;
	        
	        // 객체의 life 쵸칟
	        // new : 객체생성 
	        // 초기치(생성자) : default (color null, door int 0)
	        
	        // 여러 문장들이 수행 
	        // 객체를 정리 : 객체를 소멸 (소멸자 :db 해제, file해제 는 직접적으로 개발자가 해주어야 한다 )
	        	// (c, C++  p = null을 주고 해제명령, 이경우는 개발자가 해주었음)
	        // 자바는 메모리 해제 (Garbage Collector)가 가동 <==> dispose 
	        
	        
	        

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
	         
	         
	                
	        
	        
	}


	public static class CarClassKaja0 {

	        public static void main(String[] args) {
	                // TODO Auto-generated method stub
	                
	                //제작, 생성
	        	객체와클레스5 mycar=new 객체와클레스5(); //생성만
	        	
	        	mycar.setColor("red");
	        	mycar.setDoor(4);
	        	System.out.println(mycar.getColor() + "\t" + mycar.getDoor());
	          
	        }
	}
}
	          