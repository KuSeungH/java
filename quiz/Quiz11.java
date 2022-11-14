package quiz;

import java.util.Scanner;

// 부모(Boomo), 자녀(Janyu) 클래스를 사용하여 객체의 형변환 프로그램을 작성하시오 

// 결과는 
// 어느차를 타시렵니까?(부모차= 1, 자녀차= 2)
//2
// 자녀차타고 여행가자 
// 1
// 부모차타고 드라이브 가자 

class Boomo {
	public void car() {// 2. 메서드이름이 같아야 
		System.out.println("부모차타고 드라이브 하자 ");
	}
}

class Janyu extends Boomo { // 1. 상속에 있어서 
	public void car() {
		System.out.println("자녀차 타고 여행가자 "); // 3. 업글 
	}
}


public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("어느차를 타시렵니까?(부모차= 1, 자녀차= 2)");
		int sc1 = sc.nextInt();
		
		Boomo p77 = null;
		switch (sc1) {
		case 1 :
			p77 = new Boomo();
			p77.car(); //부모차 //1.0
			break;
			
		case 2: // 위에서 overriding을 준비해 놓고 
			p77 = new Janyu(); // 여기서 객체의 형변환을 사용함 
			p77.car(); // 자녀차 //2.0 
		default : 
			System.out.println("1,2 중 하나를 입력하삼");
			 break;
			
		}
	}

}
