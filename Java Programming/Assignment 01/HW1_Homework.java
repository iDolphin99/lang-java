/* 잔돈 계산 프로그램 (5000/1000/500/100/50/10/5) */

package Report01;

import java.util.Scanner;

public class HW1_Homework {

	public static void main(String[] args) {

		while(true) {// 사용자가 0을 입력시 탈출			
			Scanner in = new Scanner(System.in); 
			System.out.print("제품 가격 입력(1 ~ 10000): ");
			int price = in.nextInt();     // 제품 가격을 price 변수에 저장 
			
			if (price == 0)  break;       // 사용자가 0을 입력시 탈출 
			
			System.out.print("지불 금액 입력(1 ~ 10000): ");
			int pay = in.nextInt();       // 지불 금액을 pay 변수에 저장 
			
			int charge = pay - price;     // 잔돈을 charge 변수에 저장 
			// 단위에 해당되는 금액만큼 charge에서 나눈 값을 출력, 그 후 단위에 해당되는 금액만큼 나눈 나머지를 charge에 저장 
			System.out.printf("-5000원: %d개 \n", charge/5000);  charge %= 5000;  
			System.out.printf("-1000원: %d개 \n", charge/1000);  charge %= 1000;
			System.out.printf("-500원: %d개 \n", charge/500);    charge %= 500; 
			System.out.printf("-100원: %d개 \n", charge/100);    charge %= 100; 
			System.out.printf("-50원: %d개, ", charge /50); 	   charge %= 50; 
			System.out.printf("10원: %d개, ",charge/10);		   charge %= 10; 
			System.out.printf("5원: %d개, ",charge/5);		   charge %= 5; 
			System.out.printf("1원: %d개, \n",charge/1);		   charge %= 1; 
			System.out.println("=====================================");	}
		
		System.out.println("프로그램 종료......");

	}

}
