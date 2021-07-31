/*
** 프로그램 시작 시, "phoneNum.txt" 파일에서 이름과 전화번호를 한줄씩 읽어서 컬렉션에 추가하고, 
화면 출력 (최초 실행 시에는 파일이 없을 것이기 때문에 이름과 전화번호 내용 없음)

** 컬렉션에 객체 추가 시, 오름 차순(이름순)이 되도록 할 것 

** 프로그램 종료 시, 컬렉션을 순회하면서 이름\t전화번호 "phoneNum.txt" 파일 쓰기
 */


package Report02;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HW3 {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String name; String phonenumber;						// 이름, 전화번호 
		boolean flag = false;									// 전화번호 관리 프로그램 상태, true -> 종료 
		Map<String, String> dic = new TreeMap<String, String>();// TreeMap은 put 메서드를 이용해 값을 저장하면 자동으로 key값을 기준으로 정렬함
		
		System.out.println("<< 전화번호 관리 프로그램 시작 >>");
		
		
		/**********************"phoneNum.txt 파일에서 읽고 출력****************************/
		try {
			File file = new File("./phoneNum.txt");
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			String line = "";
			System.out.println("[이름] \t[전화번호]");
			while((line = bfr.readLine()) != null) { 			// 파일 내 데이터가 있을때까지, 한 줄씩 읽기 
				System.out.println(line);
				String[] strArray = line.split("\t");			// "\t"를 기준으로 이름과 전화번호를 컬렉션에 추가
				dic.put(strArray[0],strArray[1]);}
			bfr.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");}
		
		
		while(!flag) {
			System.out.println("\n\n1.추가 2.삭제 3.수정 4.검색 5.종료 : ");
			int op = sc.nextInt();								// 1~5까지의 option을 선택 
			switch(op) {
				/****************************** 데이터 추가 *****************************/
				case 1:
					System.out.println("\n이름 입력:");
					name = sc.next();
					System.out.println("전화번호 입력:");
					phonenumber = sc.next();
					dic.put(name, phonenumber);					// 컬렉션에 객체 추가 시, 오름 차순(이름순)으로 자동 정렬됨 
					
					// 전체 출력
					System.out.println("[이름] \t[전화번호]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/****************************** 데이터 삭제 *****************************/
				case 2: 
					System.out.println("\n삭제할 이름 입력:");
					name = sc.next();
					
					// 데이터 삭제
					if (dic.containsKey(name))
						dic.remove(name);
					// 예외처리 -> 삭제할 수 없는, 존해하지 않는 이름일 경우
					else
						System.out.println("없는 이릅입니다. \n\n");
					
					// 전체 출력
					System.out.println("[이름] \t[전화번호]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/****************************** 데이터 수정 *****************************/ 
				case 3: 
					System.out.println("\n수정할 이름 입력:");
					name = sc.next();
					// 예외처리 -> 수정할 수 없는, 존재하지 않는 이름일 경우 
					if (!(dic.containsKey(name))) {
						System.out.println("없는 이릅입니다.");
						break;}
					
					// 데이터 수정
					System.out.println("전화번호 입력:");
					phonenumber = sc.next();
					dic.replace(name, phonenumber);
					
					// 전체 출력
					System.out.println("[이름] \t[전화번호]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/****************************** 데이터 검색 *****************************/
				case 4: 
					System.out.println("\n검색할 이름 입력:");
					name = sc.next();
					
					// 예외처리 -> 검색할 수 없는, 존재하지 않는 이름일 경우
					if (!(dic.containsKey(name))) {
						System.out.println("없는 이름입니다."); break;}
					
					// 데이터 검색
					System.out.println(dic.get(name) +"\n\n");
					
					// 전체 출력
					System.out.println("[이름] \t[전화번호]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/***************************** 프로그램 종료 *****************************/
				//flag = true일 경우 전화번호 관리 프로그램 종료
				case 5: flag=true; break;
				
				// 예외 처리 -> 제공한 번호 이외의 숫자를 입력할 경우 
				default : System.out.println("잘못된 입력입니다. \n\n");
			}
		}
		
		/******************************phoneNum.txt 파일에 입력********************************/
		try {
			File f = new File("./phoneNum.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f)); 
			for(String key : dic.keySet()){			  // 전체 컬렉션을 돌면서 key로부터 value를 얻고 입력함
	            String value = dic.get(key);		 
	            bw.write(key + "\t" + value + "\n");} // 후에 "\t"을 기준으로 파일을 읽고 컬렉션에 데이터를 추가해야 함 
			bw.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");}
		
		
		sc.close();
		System.out.println("\n\n프로그램 종료...");
	}
}
