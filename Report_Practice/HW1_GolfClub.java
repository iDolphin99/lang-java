package Report_Practice;

public class HW1_GolfClub {
	int iron;
	String club;
	boolean isIron; // 매개 변수가 정수인지 아닌지에 대한 상태를 저장하는 변수

	// 정수를 입력받았을 때 임의의 아이언을 가진 객체 생성자
	public HW1_GolfClub(int iron) {
		this.iron = iron;
		isIron = true;
	} 

	// 7번 아이언 객체를 생성하는 기본 생성자
	public HW1_GolfClub() {
		this(7);
	} 
	
	// 문자열을 입력받았을 때 임의의 클럽을 가진 객체 생성자
	public HW1_GolfClub(String club) {
		this.club = club;
	} 

	// 매개 변수가 정수인지 아닌지에 따라 클럽 표시 
	void print() { 
		if (isIron) {
			System.out.println(iron + "번 아이언입니다.");
		} else {
			System.out.println(club + "입니다.");
		}
	} 
}