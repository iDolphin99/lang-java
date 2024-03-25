/*
 다음은 Wrapper 클래스를 활용하는 예이다. 다음 프로그램의 결과는 무엇인가? 
 */


package w7;

public class $05_WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A')); // 소문자로 변환 
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) // 숫자인가? 
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) // 영문자인가? 
			System.out.println(c2 + "는 영문자\n");
		
		System.out.println(Integer.parseInt("-123")); // 정수형식의 -123을 10진수 형태로 
		System.out.println(Integer.toHexString(28)); // 정수를 16진수 문자열로 
		System.out.println(Integer.toBinaryString(28)); // 2진수의 문자열 형식으로 
		System.out.println(Integer.bitCount(28) + "\n"); // 2진수일 때 1의 개수 
		
		Double d = Double.valueOf(3.14); // 3.14 -> Wrapper 
		System.out.println(d.toString()); // 문자열 형식으로 출력 
		System.out.println(Double.parseDouble("3.14")); // 문자열을 실수로 출력 
		
		boolean b = (4>3); 
		System.out.println(Boolean.toString(b)); // 문자열로 변환 
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 Boolean 형식으로 변환 
	}

}
