// InputStreamReader를 이용하여 MS949 문자 집합으로 한글 텍스트 파일을 읽고 출력하라


package w9;

import java.io.*;

public class $02_FileReadHangulSuccess {

	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		try {
			fin = new FileInputStream("");
			in = new InputStreamReader(fin, "MS949"); // UTF-8
			
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) 
				System.out.print(c);
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
