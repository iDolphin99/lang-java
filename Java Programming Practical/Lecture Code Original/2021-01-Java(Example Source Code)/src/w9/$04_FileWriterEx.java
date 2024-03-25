// Scanner를 이용하여 키보드에서 입력받은 데이터를 c:\Temp\test.txt 파일에 저장하는 프로그램을 작성하라.


package w9;

import java.io.*;
import java.util.Scanner;

public class $04_FileWriterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fin = null;
		int c;
		try {
			fin = new FileWriter("./test.txt");
			while (true) {
				String line = sc.nextLine();
				if(line.length()==0)
					break;
				fin.write(line, 0, line.length());
				fin.write("\r\n", 0, 2);}
			fin.close();
			sc.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
