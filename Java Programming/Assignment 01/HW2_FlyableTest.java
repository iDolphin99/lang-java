/* interface class 만들어서 method overriding */

package Report01;

interface Flyable {
	void speed();
	void height();
}

public class HW2_FlyableTest {
	public static void main(String[] args) {
		// 무명 지역 클래스 생성, FlyableTest 클래스의 멤버 필드 f
		Flyable f = new Flyable() {
			public void speed() {
				System.out.println("속도");}

			public void height() {
				System.out.println("높이");}
		}; 
		// 한 행 이상이 코드 필요 - requirements
		f.speed();
		f.height();
	}
}
