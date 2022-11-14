package quiz;

import java.util.ArrayList;

class SMarket {
	private String sangpum;
	private int price;
	private String wichi;
	
	
	// 생성자
	public SMarket(String sangpum, int price, String wichi) {
		
		// TODO Auto-generated constructor stub
		
		this.sangpum = sangpum;
		this.price = price;
		this.wichi = wichi;
		
	}
	// getter / setter
	//-----------------------------
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWichi() {
		return wichi;
	}
	public void setWichi(String wichi) {
		this.wichi = wichi;
	}
	
	// toString
	//--------------------------------------------
	public String toString() { // 출력 전무 메서드 
		return "상품이름은 " + sangpum + "이고 상품가격은 "+ price + "원 그리고 물품대매 위치는 " + wichi + "입니다";
	}
}

public class Quiz12중요 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	상품이름은 맛나도시락 이고 상품가격은 4700그리고 물품대매 위치는 C입니다
		 	상품이름은 목캔디 이고 상품가격은 5000그리고 물품대매 위치는 F입니다 
		 */
		
		/*
		   위와 같은 결과가 출력되도록 자바프로그램을 작성하시오 
		   <조건>
		   ArrayList 제네릭과 SMarke클래스를 사용한다 
		   1. 생성자로 초기치(상품명, 가격, 매대위치) 를 넣은 후 
		   
		   2. 가격이 3500이상인 것을 모두 출력한다  
		 */
		
		// 1. 생성자 : 객체 + 초기치 
		//----------------------
		ArrayList <SMarket> alist  = new ArrayList<SMarket>();
		
		// SMarket sm1 = new SMarket("맛나도시락", 4700, "C");
		// alist.add(sm1);
		alist.add(new SMarket("맛나도시락", 4700, "C"));
		
		//SMarket sm2 = new SMarket("목캔디", 5000, "F");
		//alist.add(sm2);
		
		// new SMarket(); // 이렇게 작성해도 오류가 안뜨는 이유 => 메모리에 있는데 굳이 찾아갈 이유가 없을 때 
		
		alist.add(new SMarket("목캔디", 5000, "F")); //이렇게도 작성 가능 
		alist.add(new SMarket("블루라면", 1200, "G"));
		alist.add(new SMarket("간편버거", 3000, "G"));
		alist.add(new SMarket("요구르트", 2000, "A"));
		
		// 컬랙션 안에 있는 상품 상세내열을 출력하시오 
		System.out.println(alist.get(0).toString()); //toString 생략가능 
							//ㄴ> 객체를 꺼냄  //ㄴ> 출력 전문 메서드를 사용하여 출력 
		
		for(int i = 0; i < alist.size(); i++) {
		System.out.println(alist.get(i));
		
		} System.out.println();
		
		for(int i = 0; i < alist.size(); i++) {
			if(alist.get(i).getPrice() >= 3500)
			System.out.println(alist.get(i));
			} 
			
		}
	

}
