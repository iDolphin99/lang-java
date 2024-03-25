/* 사용자로부터 금액을 입력받고 각 단위별 돈으로 환산하여 출력하는 프로그램 작성 */

package Report02;

import java.util.Scanner;

public class HW1_Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		
		System.out.print("금액을 입력하시오>> ");
		int cash = sc.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			if ((int)(cash/unit[i])==0) 
					continue;
			System.out.println(unit[i]+"원 짜리 : "+cash/unit[i]+"개"); cash %= unit[i];}
	
		sc.close();
	}

}
