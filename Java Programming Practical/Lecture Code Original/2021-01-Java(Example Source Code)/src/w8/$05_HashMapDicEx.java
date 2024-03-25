// (영어,한글) 단어를 쌍으로 해시맵에 저장하고 영어로 한글을 검색하는 프로그램을 작성하라. 
// "exit"이 입력되면 프로그램을 종료한다. 


package w8;

import java.util.HashMap;
import java.util.Scanner;

public class $05_HashMapDicEx {

	public static void main(String[] args) {
		// 영어 다넝와 한글 단어의 ㅆ앙르 저장하는 HashMap 컬렉션 생성 
		HashMap<String,String> dic = new HashMap<String, String> (); 
		
		// 3개의 (key,value) 쌍을 dic에 저장 
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과 ");
		
		// 영어 단어를 입력받고 한글 단어 검색, "exit" 입력받으면 종료 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("찾고 싶은 단어는?");
			String eng = sc.next();
			
			if(eng.equals("exit"))
				break;
			
			String kor = dic.get(eng);
			if (kor == null)	System.out.println(eng + "는 없는 단어 입니다.");
			else				System.out.println(kor);
		}
		System.out.println("종료합니다...");
	}

}
