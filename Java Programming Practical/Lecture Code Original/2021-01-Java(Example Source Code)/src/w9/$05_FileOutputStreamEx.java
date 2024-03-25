/*
 FileOutputStream을 이용하여 byte [] 배열 속에 들어 있는 바이너리 값을c:\Temp\test.out 파일에 저장하라. 
 이 파일은 바이너리 파일이 되므로 메모장으로 볼 수 없다. 
 이 파일은 예제 6에서 FileInputStream을 이용하여 읽어다시 출력한다.
 */


package w9;

import java.io.*;

public class $05_FileOutputStreamEx {

	public static void main(String[] args) {		
		byte b[] = {7,51,3,4,-1,24};

		try {
			FileOutputStream fin = new FileOutputStream("./test_bin.out");
			
			for (int i=0; i<b.length; i++)
				fin.write(b[i]);
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
		System.out.println("저장 성공");
	}

}
