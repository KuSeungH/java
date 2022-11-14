package quiz;
		//빵의 종류, 가격이 들어있는 기본 설계더를 만들고 거기에 캡슐화를 적용시키시오 
		// 또한 빵이 판매 될때마다 객체를 만들고 판매된 빵의종류, 가격을 getter, setter로 출력하시오 
		// 일반적인 출력 전문 메소드를 하나 만들어 판매된 내용을 출력하시오 
class Bread{ // 설계도(정의)
	private String kind;
	private int price;
	
	public void sell() { 
		System.out.println("빵 이름은 " + kind + "\t"+ " 빵가격은 " + price); 
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Quiz10 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread myBread = new Bread(); //제작 (생성)
		
		myBread.setKind("단팥빵");
		
		myBread.setPrice(1000);
		
		
		System.out.println("빵종류= " + myBread.getKind() + "\t" + "빵가격= " + myBread.getPrice() + "원");
		 
		Bread myBread1 = new Bread(); // 생성
		
		myBread1.setKind("모카빵");
		
		myBread1.setPrice(2000);
		
		
		System.out.println("빵종류= " + myBread1.getKind() + "\t" + "빵가격= " + myBread1.getPrice() + "원");
		
		Bread myBread2 = new Bread(); // 생성
		
		myBread2.setKind("피자빵");
		
		myBread2.setPrice(1500);
		
		myBread2.sell(); //이것도 출력 가능 
		//System.out.println("빵종류= " + myBread2.getKind() + "\t" + "빵가격= " + myBread2.getPrice() + "원");
		
	
	}

}
