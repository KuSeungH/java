package javasds;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일2 {

	// 파일 copy 단 byte 단위로 
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
								// main()을 호출한 JVM에게 예외를 던짐 
								//JVM이 처리함 
		
		// byte 단위 // 그림이나 음악파일 
		
				// FileInputStream,  FileOutputStream
				// read()  : 1바이트 단위로 처리(010011..) 아스키코드에서 : A - 65 - 01000001
				// read(배열) : 배열 단위 
				// write() ... 도 마찬가지 	
		// byte단위로 그림파일 복붙하는 문제 
		// 그림파일에서 11001001 꺼내 ==> int imsi방 ==> 다시 파일로 복붙 
		
		int imsi = 0; // 'A' ==> 문자상수 (문자A이면서 동시에 아스키코드 65)
		FileInputStream fis1 = null; // byte단위 
		FileOutputStream fos1 = null;
		
		//------------------
		//if(args.length ==2) { // 원본 파일명과 사본파일명 합해서 2개파일 
			fis1 = new FileInputStream ("21.jpg"); // open
			fos1 = new FileOutputStream ("21.jpg", false); // open
			
			//--------------
			while((imsi = fis1.read()) != -1) {
				//read() 괄호안이 비어있으면 한 바이트 단위로 처리 
				fos1.wait(imsi); //파일에 출력
				System.out.println(imsi + "나 지금 복사중인데");
			}
				fis1.close(); fos1.close();
	} 

}
