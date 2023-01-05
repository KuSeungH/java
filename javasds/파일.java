package javasds;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 파일 {

	public static void main(String[] args) throws IOException { 
											//throws IOExcption { // re- throw
											//throws IOExcption { // 이것은 나중에 만들자 
		// 문자열 단위 file read하겠다 
		// FileReader fr = FileReader("aa:txt"); / => open
										// e:\aa.txt --> error
		
		//--------------------------------
		// 현재 액박떠서 ctrl + shift+o
		// 아직도 남아 있으면 거기에 마우스 대보자는 
			// 1. throws 2. surround with.....
		// try-catch ==> throws
		//---------------------------------
		
		// TODO Auto-generated method stub

		//텍뷰 (텍스트뷰어-viewer) - 글을 입력x // tts - 텍스트를 소리로 변화 
		
		// 메모장 파일 - read - 화면에 출력 
		
		//file 의 스트림
		// (file => 메모리, 메모리 => 파일)
							
							// 그림파일 복사, 전송 
							// 01110110000111		bado 강 바다 
		
			//Stream : byte stream(1바이트)	/	문자 stream(2바이트)
			//			(input/ output stream)		(reader, writer)
		
		
		// 파일작성방법 - 텍스트 뷰어 
		
		// open
		//  |
		// read(메모정파일의 내용을 꺼내는것 ) ==> 메모리 ==> 출력 
		//  |
		// close
		
		// 문자 스트림 
		// open
		// FileReader fr = new FileReader("d:aa.txt"); // 끄집어 내려고 Reader을 사용한다 
		FileReader fr = new FileReader("aa.txt");
			// 참고적으로 input,output, stream이 보이면 바이트 stream
			// reader, writer 가 보이면 문자 stream
		
		BufferedReader br = new BufferedReader(fr); // open포함 
		// 임시방에 버퍼링 한후 한줄처리 해보자는~
		
		//read는 파일에서 읽어서to 기억하고(변수)
			// write는 키보드등으로 입력하여 to 파일에 
		String s = null;
		// file read - 화면 출력(write) // byte경우는 reaInt...
		// fr을 바로 사용시에는 .read() 사용으로 한글짜씩 처리
		while((s = br.readLine()) != null) {
										// 한글자의 씩의 끝 : eof, -1 ->파일의 한글자 끝은 - 1로 으로 정의했다, 한줄의 끝은 null로 정의했다  
			System.out.println(s); //화면 출력 
		}
		
		
		// 아래한글 // 화면에 하얀빈공간이 있는데 
		br.close();
		fr.close();
		
			
	}

}	//stand alone vs multi uesr system
	// 소유권 



