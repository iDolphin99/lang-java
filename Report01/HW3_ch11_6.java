package Report01;

import java.util.Scanner;
import java.util.stream.Stream;

public class HW3_ch11_6 {

	public static void main(String[] args) {
		// 스트림을 통해 입력한 문자열을 받아들임
		Stream<String> kb = Stream.generate(() -> new Scanner(System.in).nextLine());
		// 5글자인 문자열을 출력
		System.out.println(kb.limit(5).filter(s -> s.length() == 2).count());
	}

}