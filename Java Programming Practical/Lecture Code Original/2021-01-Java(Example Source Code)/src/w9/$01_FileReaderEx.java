/*/
 FileReader를 이용하여 c:\windows\system.ini 파일을 읽어 화면에 출력하는 프로그램을 작성하라. 
 system.ini는 텍스트 파일이다.
 */


package w9;

import java.io.*;

public class $01_FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			while ((c = fin.read()) != -1) 
				System.out.print(c);
			fin.close();			
		} 
		catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
