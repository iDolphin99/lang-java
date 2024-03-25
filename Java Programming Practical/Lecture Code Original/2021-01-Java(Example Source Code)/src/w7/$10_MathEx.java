// Math 클래스의 다양한 메소드 활용 예를 보아라 

package w7;

public class $10_MathEx {

	public static void main(String[] args) {
		System.out.println(Math.PI); // 원주율 상수
		System.out.println(Math.ceil(3.14)); // 올림 
		System.out.println(Math.floor(3.14)); // 내림
		System.out.println(Math.sqrt(9)); // 제곱근 
		System.out.println(Math.exp(2)); // e의2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// [1,45] 사이의 정수형 난수 5개 발생
		System.out.print("이번주 행운의 번호는 ");
		for (int i = 0; i<5; i++)
			System.out.print((int)(Math.random()*45 + 1) + " " );
	}

}
