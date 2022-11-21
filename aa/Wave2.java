package aa;

public class Wave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  LOVE 단어를 123번째 글자인 OVE를 먼저 출력하고 
		  바로 이어서 L을 출력하는 형식의 프로그램을 작성하시오 
		  단, 이런형식의 출력을 200번 반복 출력하고 문법으로는 
		  substring()을 사용하시오 
		  실제로는 I LOVE You를 사용하시오 
		 */
		
		//LOVE
		//OVEL

		String s1=" I LOVE YOU"; // 전광판프로그램 GUI 를 위해 
		//String s1 = "LOVE"
		// System.out.println(s1.substring(1,2)); // O

		//객체.메서드() //1st부터 2nd 까지 나와라

		/*
		* 1st 0123
		* LOVE
		*
		* 2nd 1234
		*
		*/
		// System.out.print(s1.substring(1,3));//ov
		// System.out.println();

		/*
		* 단, 이런형식의 출력을 200번 반복 출력하고 문법으로는
		* substring()을 사용하시오.
		*/
		int i = 0;
		while(true) {
		s1=s1.substring(1,s1.length())+s1.substring(0,1);

		System.out.print(s1);
		System.out.println();
		i++;
		if(i==200) {
		break;
			}
		}
	}
}