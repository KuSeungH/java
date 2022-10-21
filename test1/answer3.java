package test1;

class SooDanClass {
	private String poomname;
	private int soo;
	private int dan;
	
	public void sell() { 
		System.out.println(poomname +" " + soo + " " + dan); 
	}
	
	public String getPoomname() {
		return poomname;
	}
	public void setPoomname(String poomname) {
		this.poomname = poomname;
	}
	public int getSoo() {
		return soo;
	}
	public void setSoo(int soo) {
		this.soo = soo;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
}


public class answer3 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 문항3] 객체지향프로그래밍을 사용하여 아래 처럼 출력결과가 나오는 자바 프로그램을 작성하시오
		<조건>
		-.main() 있는 클래스 이름은 SooDanClass 로 한다
		-. 별도로 Sangpoom 클래스를 만들고 그 안에 작성할 속성(필드)은 상품이름, 수량 , 단가 3개이며
		속성명은 poomname(문자열), soo(정수), dan(정수) 로 작성한다
		-. 속성에 대한 getter, setter를 작성한다
		-. main()에 객체를 하나 만들고 getter, setter를 사용하여 품명은 우유 , 수량은 20, 단가 1000원을 객체에 넣고
		출력처럼 출력하는 문장을 만든다
		-. 객체를 또 하나 만들고 생성자를 사용하여 품명은 빵 , 수량은 100, 단가 500 을 객체에 넣고
		출력처럼 출력하는 문장을 만든다
		-.빵 에 대한 화면 출력시 toString울 사용 가능하다면 toString을 사용한다
		 */
		
		SooDanClass Sc1 = new SooDanClass();
		
		Sc1.setPoomname("우유");
		Sc1.setSoo(20);
		Sc1.setDan(1000);
		
		
		
		SooDanClass Sc2 = new SooDanClass();
		
		Sc2.setPoomname("빵");
		Sc2.setSoo(100);
		Sc2.setDan(500);
		
		Sc1.sell();
		Sc2.sell();
	
		
	}

}
