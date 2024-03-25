// 바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라


package w9;

import java.io.*;

public class $10_BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("");
		File dest = new File("");
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			
			while ((c = fi.read()) != -1) 
				fo.write((byte)c);
			
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를" + dest.getPath() + "로 복사하였습니다.");
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
