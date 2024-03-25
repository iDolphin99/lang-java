// InputStreamReader의 문자 집합을 US-ASCII로 지정하여 한글 파일을 읽고 출력하라.


package w9;

import java.io.*;

public class $03_FileReadHangulFail {

	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("");
			in = new InputStreamReader(fin,"US-ASCII"); // 문자 집합 지정이 잘못된 경우 제대로 인식되지 못함 (주의!!) 
			
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read())!=-1) 
				System.out.print((char)c);
			
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
