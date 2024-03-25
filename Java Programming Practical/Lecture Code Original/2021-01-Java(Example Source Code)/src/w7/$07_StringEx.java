// String 클래스의 다양헨 메소드를 활용하는 예를 보아라. 

package w7;

public class $07_StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(개수)
		System.out.println(a.contains("#") + "\n"); // 문자열 포함 관계 
		
		a = a.concat(b); // 문자열 연결 
		System.out.println(a + "\n");
		
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a + "\n");
		
		a = a.replace("C#", "Java"); // 문자열 대치 
		System.out.println(a);

		String s[] = a.split(","); // 문자열 분리 
		for (int i = 0; i<s.length; i++)
			System.out.println("분리된 문자열"+i+": "+s[i]);
		
		a = a.substring(5); // 부분 문자열, 인덱스 5부터 끝까지 서브 스트링 리터 
		System.out.println("\n"+a+"\n");
		
		char c = a.charAt(2); // 인덱스로 문자열의 문자에 접근 
		System.out.println(c);
	}

}
