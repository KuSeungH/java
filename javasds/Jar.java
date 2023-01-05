package javasds;

public class Jar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		short ss= 32767;
		int bb= ss;	// 자료의 형변환 : 암시적 .목시적 형변환 
					// implicit conversion 
		
		// cast 연산자	// cast it away
		short s1=(short)bb;	// 명시적 형변환, explicit conversion
		
		int ff = 3;	//stack memory
		Object gg = ff;	// boxing
		
		int hh = (int)gg; //unboxing
		System.out.println(hh);
		
		
		// heap -> static -> stack -> code
		// String aa = "ondal" -> static int aa -> int aa -> ff 
		
		int aaa = 100;
		aaa++; // 101
		++aaa; // 102
		
		System.out.println(aaa++);
		System.out.println(++aaa);

	}

}
