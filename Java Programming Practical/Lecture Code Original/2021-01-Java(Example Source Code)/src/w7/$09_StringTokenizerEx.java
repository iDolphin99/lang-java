/*
 "홍길동/장화/홍련/콩쥐/팥쥐" 
 문자열을 '/'를 구분 문자로 하여 토큰을 분리하여 각 토큰을 출력하라. 
 */

package w7;

import java.util.StringTokenizer;

public class $09_StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		
		while(st.hasMoreTokens()) // st -> 시작 reference 주소, 현재 위치에 token이 있는가 
			System.out.println(st.nextToken()); // 현재 위치의 token을 읽은 후 반환하고 다음 token의 위치로 변경됨

	}
}
