package Report_Practice;

public class HW1_Demo {
	public static void main(String[] args) {
		HW1_Complex c1 = new HW1_Complex(2.0);      // 매개 변수가 하나인 생성자 테스트
		c1.print(); 
		HW1_Complex c2 = new HW1_Complex(1.5, 2.5); 
		c2.print();    					    // 매개 변수가 둘인 생성자 테스트

		System.out.println();

		HW1_GolfClub g1 = new HW1_GolfClub();       // 기본 생성자 테스트
		g1.print(); 
		HW1_GolfClub g2 = new HW1_GolfClub(8);      // 매개 변수가 정수인 생성자 테스트
		g2.print(); 
		HW1_GolfClub g3 = new HW1_GolfClub("퍼터");  // 매개 변수가 문자열인 생성자 테스트
		g3.print(); 
	}
}