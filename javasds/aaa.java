package javasds;

public class aaa {
	public static void main(String[] args) {
		int aaa = 100;
		aaa++; // 101
		++aaa; // 102
	
		System.out.println(aaa++); //후치연산자 //102 -> 103
		System.out.println(++aaa); //전치연산자 //104
	}
}
