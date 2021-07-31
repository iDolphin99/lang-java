/* 과목, 성적을 출력하는 프로그램 작성
 * "그만"을 입력시 프로그램 종료
 * 없는 과목에 대해서 예외처리 작성 */

package Report02;

import java.util.Scanner;

public class HW1_Practice14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55};
		boolean flag = false;
		
		while(true) {
			System.out.print("과목 이름>> ");
			String op = sc.next();
			if (op.equals("그만"))  // "그만"을 입력시 프로그램 종료 
				break;
			
			for (int i=0 ; i<course.length; i++) {
				if (course[i].equals(op)) {
					System.out.println(op + "의 점수는 " + score[i] );
					flag = true;}}  // 과목을 찾으면 true 
			if (flag==false) 		// 찾지 못하면 false
				System.out.println("없는 과목입니다.");
			
			flag=false;}
		
		sc.close();
	}
}
