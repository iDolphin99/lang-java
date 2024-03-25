/*
 버퍼 크기를 5로 하고, 표준 출력 스트림(System.out)과 연결한 버퍼 출력 스트림을 생성하라. 
 c:\Temp\test2.txt 파일을 저장된 텍스트를 읽어 버퍼 출력 스트림을 통해 출력하라.
 */


package w9;

import java.util.Scanner;
import java.io.*;

public class $07_BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("./test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5); // 화면에 출력하겠다는 뜻 System.out
			
			while((c=fin.read()) != -1) 
				out.write(c);
			
			// 버퍼가 꽉 찰때 문자가 화면에 출력된다 
			// 출력 스트림의 버퍼 크기가 5이므로 5개의 문자만 출력됨 
			// 버퍼에 남아 있던 모든 문자를 출력하기 위해 
			// 엔터키를 입력함으로써 버퍼에 남아 있는 문자를 다 꺼내서 비워줌 
			new Scanner(System.in).nextLine();
			out.flush();
			
			fin.close();
			out.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
