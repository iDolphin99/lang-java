/*
* 6-8: 문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램 작성.
- 힌트: substring() 메서드 활용, nextLine()을 이용하면 빈칸을 포함하여 한번에 한줄을 읽을 수 있음, 문자열.length()

*(실행 결과)

문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.

나는 너를 사랑합니다. >> 입력문자열
는 너를 사랑합니다.나  >> 여기서부터 출력 문자열 
 너를 사랑합니다.나는
너를 사랑합니다.나는 
를 사랑합니다.나는 너
 사랑합니다.나는 너를
사랑합니다.나는 너를 
랑합니다.나는 너를 사
합니다.나는 너를 사랑
니다.나는 너를 사랑합
다.나는 너를 사랑합니
.나는 너를 사랑합니다
나는 너를 사랑합니다.  >> 여기까지
 */

package Report02;

import java.util.Scanner;

public class HW2_Practice6_8 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine(); //입력된 문자열
		
		//txt.length(), 받아들인 문자열의 길이만큼 for문 실행 
		for(int i=0; i<txt.length(); i++) {
			//substring(시작할 index번호, 마지막 index번호)
			//시작 index번호부터 마지막 index번호까지의 문자를 읽음
			String first = txt.substring(0,1);
			String last = txt.substring(1,txt.length());
			txt = last + first; 
			System.out.println(txt);}
		
		sc.close();
	}
}
