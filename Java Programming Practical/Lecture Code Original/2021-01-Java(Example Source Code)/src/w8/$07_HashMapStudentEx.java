// id와 전화번호로 구성되는 Student 클래스를 만들고
// 이름을 '키'로 하고 Student 객체를 '값'으로 하는 해시맵을 작성하라

package w8;

import java.util.*;


// 학생을 표현하는 클래스 
class Student {
	private int id;
	private String phone; 
	
	public Student (int i, String p) {
		this.id = i;
		this.phone = p;}
	
	public int getID() {return id;}
	public String getPhone() {return phone;}
}

public class $07_HashMapStudentEx {

	public static void main(String[] args) {
		// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성 
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		// 3명의 학생 저장 
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));

		// "exit"를 입력할 때 까지 검색
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("검색할 이름?");
			String name = sc.next();
			
			if (name.equals("exit"))	break;
			
			Student student = map.get(name);
			
			if (student == null)	System.out.println(name + "는 없는 사람입니다.");
			else System.out.println("id:" + student.getID() + ", 전화:" + student.getPhone());
		}
		
	}

}
