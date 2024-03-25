/*
 문자 스트림 FileReader와 FileWriter를 이용하여 c:\windows\system.ini를 c:\Temp\system.txt 
 파일로 복사하는 프로그램을 작성하라.
 */


package w9;

import java.io.*;

public class $09_TextCopyEx {

	public static void main(String[] args) {
		// 원본 파일 경로명
		// 복사 파일 경로명
		File src = new File("./test.txt");
		File dest = new File("./test2.txt");

		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			// 한 문자씩 읽고 쓴다 
			while ((c=fr.read()) != -1)
				fw.write((char)c);
			
			fw.close();
			fr.close();
			System.out.println("파일을 복사하였습니다.");
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
	}

}
