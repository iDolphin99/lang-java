package Report_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HW2{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		// 키의 값이 String 타입인 Map
		Map<String, String> m = new HashMap<>();

		// HashMap에 5개의 객체 추가
		m.put("일본", "도쿄");
		m.put("스페인", "마드리드");
		m.put("네팔", "카트만두");
		m.put("이탈리아", "로마");
		m.put("체코", "프라하");

		// HashMap에 있는 모든 키를 ArrayList 타입으로 변환
		List<String> list = new ArrayList<>(m.keySet());

		System.out.println("*** 수도 맞추기 게임 시작 ***");
		while (true) {
			// 인덱스가 0~5 사이의 int 타입의 난수 원소를 key에 저장
			String key = list.get(r.nextInt(5));
			System.out.print(key + "의 수도는? ");
			String s = in.next();

			// 사용자로부터 '종료'를 입력 받으면
			if (s.equals("종료")) {
				System.out.println("게임 종료...");
				break; // 반복문 탈출
			}
			// 입력한 값이 주어진 키에 해당하는 값, 정답이면
			if (s.equals(m.get(key)))
				System.out.println("정답!!"); // 정답일시
			else
				System.out.println("아닙니다!!"); // 오답일시
		}
	}

}
