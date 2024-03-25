// 예제 10을 10KB 단위로 읽고 쓰도록 수정하여 고속으로 파일을 복사하라
// block 단위, 배열을 잡아서 처리하는 것 
// ㄹㅇ 모르겠다 뭔소리인지 


package w9;

import java.io.*;

public class $11_BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("");
		File dest = new File("");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			
			// 10KB 버퍼 생성 
			byte [] buf = new byte [1024*10]; 
			
			while (true) {
				int n = fi.read(buf);	// 버퍼 크기만큼 읽기, n은 실제 읽은 바이트 
				fo.write(buf, n, 0);	// buf[0] 부터 n 바이트 쓰기 
				if (n < buf.length)
					break;
			}
			
			
			fi.close();
			fo.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
