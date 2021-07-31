/* 사용자로부터 정수를 입력받은 후 정수의 개수만큼 랜덤 숫자 출력 프로그램 작성 */

package Report02;

import java.util.Random;
import java.util.Scanner;

public class HW1_Practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// 정수를 입력받은 후 배열 생성 
		System.out.print("정수 몇개? ");
		int n = sc.nextInt();
		int [] unit = new int[n];
		
		// 랜덤 숫자 넣기 
		for (int i=0; i<n ; i++) {
			unit[i] = rand.nextInt(99)+1;
			for (int j=0;j<i;j++) {  // 중복된 숫자 제거 
				if (unit[j]==unit[i])
						i--;}}
		
		// 숫자 출력 
		for (int number : unit)
			System.out.print(number + " ");
		
		sc.close();
	}
}
