// Collections 클래스를 활용하여 문자열 정렬, 반대로 정렬, 이진 검색 등을 실행하는 사례를 살펴보자 

package w8;

import java.util.*;


public class $08_CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator <String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String seperator; 
			if (iterator.hasNext()) seperator = "->";
			else 					seperator = "\n";
			System.out.print(e + seperator);}
	}
	
	public static void main(String[] args) {
		LinkedList <String> myList = new LinkedList <String> ();
		
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		// static 메소드 이므로 클래스 이름으로 바로 호출 
		// 요소를 정렬 
		Collections.sort(myList);
		printList(myList);
		
		// 요소의 순서를 반대로 정렬 
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는" + index + "번째 요소입니다.");
	}

}
