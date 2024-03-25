// 이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력하라. 


package w8;

import java.util.ArrayList;
import java.util.Scanner;
// import java.util.*;

public class $03_ArrayListEx {

	public static void main(String[] args) {
		// 문자열만 삽입 가능한 ArrayList 컬렉션 생성 
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		// 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		for (int i =0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = sc.next();
			list.add(s);}
		
		// ArrayList에 들어 있는 모든 이름 출력 
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.print(str + " ");}
		
		// 가장 긴 이름 출력
		int longidx= 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).length() > list.get(longidx).length())
				longidx = i; }
		System.out.println("\n가장 긴 이름은: " + list.get(longidx));
		
	}

}
