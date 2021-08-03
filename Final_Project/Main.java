package Final_Project;

/*
- 자율 주제
- 메인클래스, 추상클래스(또는 인터페이스) 등을 포함해서 총 3개 이상 클래스로 구현
- 모든 클래스의 생성자 구현할 것(인터페이스 인 경우 제외)
- 최소 1개 private 인스턴스 변수 사용할 것   
- 최소 1개의 예외처리 구문 사용할 것.
- ArrayList (또는  기타 컬렉션.교재11장) 사용할 것.
- 복수의 자바 파일로 작성할 것.(주석 필수)
 */

import java.util.ArrayList;
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		ArrayList<Person> List = new ArrayList<>(); // 동아리 회원 정보 입력을 위한 ArrayList List 선언, Person 객체 타입 선언
		Scanner in = new Scanner(System.in);
		int select = 0; // 사용자로부터 기능 선택을 받기 위함

		// 사용자로부터 4번을 입력받을 때 까지 계속 실행
		out: while (true) {
			System.out.println("*** 동아리 회비 명부 ***");
			System.out.println("1.동아리 회원 입력 ");
			System.out.println("2.동아리 회원 출력 ");
			System.out.println("3.동아리 회원 삭제 ");
			System.out.println("4.종료");
			System.out.println("******************");
			System.out.println("원하는 기능을 입력하세요 : ");
			select = in.nextInt();

			// 사용자로부터 받은 번호로 해당 메뉴로 이동
			switch (select) {
			case 1:
				List.add(Menu.Add());
				break;
			case 2:
				Menu.Show(List);
				break;
			case 3:
				Menu.Delete(List);
				break;
			case 4:
				System.out.println("\n\n끝 종료~~^..^");
				break out;
			default: // 메뉴 이외의 번호 입력 받을 경우
				System.out.println("다시 입력하세요.");
				break;
			}
		}
	}

}
