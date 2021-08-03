package Final_Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	// 임시로 입력 받은 값을 저장할 변수들
	static String name;
	static int studentID;
	static int pay;

	// 1. 더하기 메서드
	public static Person Add() {
		// 배열에 넣을 객체 생성
		Person p = new Person();
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("이름 : ");

			name = in.next();
			p.setName(name);
			System.out.println("학번 : ");
			studentID = in.nextInt();
			// 숫자 입력을 받은 후 남아 있는 개행 문자 처리를 위함
			in.nextLine();
			p.setStudentID(studentID);
			System.out.println("납부한 금액 : ");
			pay = in.nextInt();
			in.nextLine();
			p.setPay(pay);
			System.out.println("******************");
			System.out.printf("\n\n\n\n");

		} catch (NumberFormatException e) {
			System.out.println("제대로 입력하세요.\n\n");
		} catch (Exception e) {
			System.out.println("제대로 입력하세요.\n\n");
		} // 예외 처리 구문, 타입에 맞지 않는 값을 입력했을 경우

		return p;
	}

	// 2. 출력 메서드
	public static void Show(ArrayList<Person> List) {
		// 배열이 아직 생성되지 않았을 경우 예외 메시지
		if (List.isEmpty()) {
			System.out.println("입력된 정보가 없습니다.\n\n");
		} else {
			out: for (Person p : List) { // 객체가 가지고 있는 정보 중 납부 금액을 제외한 정보에 아무것도 입력되지 않았을 경우
				if (p.getName() == null | p.getStudentID() == 0) {
					System.out.println("입력된 정보가 없습니다.\n\n");
					List.remove(0); // 없는 정보가 저장되어 있는 배열 요소 삭제
					break out;
				}
				System.out.println("이름 : " + p.getName());
				System.out.println("학번 : " + p.getStudentID());
				System.out.println("납부 비용 : " + p.getPay() + "\n\n");
			}
		}

	}

	// 3. 삭제 메서드
	public static void Delete(ArrayList<Person> List) {
		Scanner in = new Scanner(System.in);
		// 배열이 아직 생성되지 않았을 경우 예외 메시지
		if (List.isEmpty()) {
			System.out.println("입력된 정보가 없습니다. \n\n");
		}

		else {
			for (Person p : List) {
				if (p.getName() == null | p.getStudentID() == 0) {
					System.out.println("입력된 정보가 없습니다.\n\n");
					List.remove(0);
					break;
				}
			}
			try {
				System.out.println("삭제할 학생의 학번을 입력하세요 : ");
				studentID = in.nextInt(); // 사용자로부터 삭제할 학생의 번호를 받음
				// 삭제되었거나 이미 없는 학생 번호일 경우를 위한 deleted 변수
				boolean deleted = false;
				while (true) {
					for (int i = 0; i < List.size(); i++) {
						if (List.get(i).getStudentID() == studentID) {
							List.remove(i);
							deleted = true;
						}
					}
					if (deleted == false)
						System.out.println("없는 학생입니다. \n\n");
					break;
				}
			} catch (Exception e) {
				System.out.println("제대로 입력하세요. \n\n");
				// 예외 처리 구문, 숫자 이외의 것을 입력하였을 경우
			}
		}
	}
}
