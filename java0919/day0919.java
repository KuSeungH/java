package java0919;

public class day0919 {
									// 문자배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Hello");
		// jdk : run 15 & edit 11
		
		// 다른사람 한테 줄때 
		if(args.length != 2) {
			
			System.out.println("정신 똑바로!!!!!!");

			System.out.println("사용법은 인자 2개 입력 해야함 ");
			
			//System.exit(1)
			return;
		}
			
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
	}

}
// 메모장 : 윈도으 메모장아이콘을 클릭 -> notepad.exe -> 메모장 뜸 
// java -> exe -> 가동되서 메모리 뜸 
// copy.exe aa(원본) bb(사본) 이클립스에서 실행이 기본적으로 안됨
// 명령행 인자(commandline argument)
// 30 + 80프로그램을 작성 
// duehae.exe 30 80 
// 110
// 리눅스 : wc 30 + 80 =110

