package javasds;

public class String1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pp = 100; //int, double, char....
		String aaa="ondal"; //문자열 // heap
		
		//heap memory		// 문자열 : 여러글자 "AAA"
		// char ch1 ='나' char ch2='A'; // 문자 상수 
		
		// NPE(null pointer exception)
		String ppp =null;	// null pointer error
		String qqq= "";		// 빈문자열 (길이가 0인 문자열) // ""
		
		System.out.println(ppp.length()> 0); //null pointer
		System.out.println(qqq.length()> 0);	// false

	}
		
}
