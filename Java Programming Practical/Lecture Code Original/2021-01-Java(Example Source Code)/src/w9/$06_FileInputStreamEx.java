/*/
 FileInputStream을 이용하여 c:\Temp\test.out 파일(5에서 저장한 파일)을 읽어 byte [] 배열 속에 저장하고 화면에 출력하라.
 */


package w9;

import java.io.*;

public class $06_FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte [6];
		try {
			FileInputStream fin = new FileInputStream("./test_bin.out");
			
			int n=0, c;
			while ((c=fin.read())!= -1) {
				b[n] = (byte)c; 
				n++;}
			
			System.out.println("읽은 배열을 출력합니다.");
			for (int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		}
		
		catch (IOException e) {
			System.out.println("파일 입출력 실패");
		}

	}

}
