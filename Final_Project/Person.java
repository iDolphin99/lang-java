package Final_Project;
// 동아리 회원의 정보 객체 , 이름, 학번, 납부 금액으로 이루어져 있다. 
public class Person {
	// 접근자와 설정자를 통해서 접근해야 함
	private String name;
	private int studentID;
	private int pay;

	// Person class 생성자, 조건을 맞추기 위한 생성자
	public Person(String name, int studentID, int pay) {
		this.name = name;
		this.studentID = studentID;
		this.pay = pay;
	}

	public Person() {
		this("박형빈", 2018204094, 10000);
	}

	// 접근자
	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getPay() {
		return pay;
	}

	// 설정자
	public void setName(String name) {
		this.name = name;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
