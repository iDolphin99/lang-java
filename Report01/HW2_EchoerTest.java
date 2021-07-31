/* 추상 class를 이용해서 "끝" 입력할 때까지 문자열 저장 */

package Report01;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("시작합니다.");}

	abstract void echo();
	
	void stop() {
		System.out.println("종료합니다.");}
}

public class HW2_EchoerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Echoer e = new Echoer() {
			// echo 메서드 추가
			void echo() {
				while (true) {
					String s = in.nextLine(); // 다음 줄을 입력받아 사용자의 말을 문자열 s에 저장
					System.out.println(s); 	  // 문자열 s 출력
					if (s.equals("끝")) 		  // 문자열 s가 '끝'을 입력받으면 중지
						break; 				}}
		};
		// 한 행 이상의 코드 필요 - requirements
		e.start();
		e.echo();
		e.stop();
	}
}
