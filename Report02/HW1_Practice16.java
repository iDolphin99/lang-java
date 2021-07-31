/* 가위바위보 게임 프로그램 작성 
 * "그만"을 입력시 프로그램 종료 */

package Report02;

import java.util.Random;
import java.util.Scanner;

public class HW1_Practice16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		String RCP [] = {"가위","바위","보"};
   
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보!>>");

			String op = sc.next();
			if (op.equals("그만")) // "그만"을 입력할 경우 프로그램 종료
				break;
			String cp = RCP[rand.nextInt(3)]; // 컴퓨터의 가위 바위 보
			
			// 가위 바위 보 비교 
			if (op.equals("가위")) {
				if (cp == RCP[0]) System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 비겼습니다.");
				else if ( cp == RCP[1]) System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 컴퓨터가 이겼습니다.");
				else System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 사용자가 이겼습니다.");
			}
			else if (op.equals("바위")) {
				if (cp == RCP[0]) System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 사용자가 이겼습니다.");
				else if ( cp == RCP[1]) System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 비겼습니다.");
				else System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 컴퓨터가 이겼습니다.");
				}
			else if (op.equals("보")) {
				if (cp == RCP[0]) System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 컴퓨터가 이겼습니다.");
				else if ( cp == RCP[1]) System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 사용자가 이겼습니다.");
				else System.out.println("사용자=" + op + ", 컴퓨터=" + cp + ", 비겼습니다.");
				}
			else // 가위 바위 보 이외의 것을 입력할 경우
				System.out.println("잘못 입력하셨습니다. ");
		}
		System.out.println("게임을 종료합니다...");
		
	
		sc.close();
	}

}
