// StringBuffer를 이용하여 문자열을 조작하는 다음 코드의 실행 결과는 무엇인가? 

package w7;

public class $08_StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7,  " my");
		System.out.println(sb);

		sb.replace(8,10,"your");
		System.out.println(sb);
		
		sb.delete(8, 13);
		System.out.println(sb);
		
		sb.setLength(4);
		System.out.println(sb); // sb.toString()으로 자동 변환 
	}

}
