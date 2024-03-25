// 해시맵을 이요하여 학생의 이름과 자바 점수를 기록 관리하는 프로그램을 작성하라. 

package w8;

import java.util.*;

public class $06_HashMapScoreEx {

	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성 
		HashMap <String, Integer> dic = new HashMap <String, Integer> (); 
		
		// 5개의 점수 저장 
		dic.put("김성동", 97);
		dic.put("황기태", 88);
		dic.put("김남윤", 98);
		dic.put("이재문", 70);
		dic.put("한원선", 99);
		
		// HashMap 요소의 개수 출력
		System.out.println("HashMap의 요소 개수 :" + dic.size());
		
		// 모든 사람의 점수 출력
		// HashMap에 들어 있는 모든 (key,value) 쌍 출력
		// key 문자열을 가진 집합 Set 컬렉션 리턴 -> Set interface 집합 형태로 요소를 얻어오고 저장하는 제네릭 
		Set<String> set = dic.keySet();
		//System.out.println(set);
		
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴 
		Iterator <String> it = set.iterator();
		
		while (it.hasNext()) {
			String name = it.next();
			int score = dic.get(name);
			System.out.println(name + ":" + score);
		}
		
	}

}
