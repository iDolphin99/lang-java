/* 내부 클래스 작성, 10개의 객체 배열 생성, add()/show() 메서드 완성 */

package Report01;

class Hotel {
	private class Room {
		int number;
		String client;

		// 내부 클래스
		public Room(int number, String client) {
			// 생성자 설정
			this.number = number; // 매개변수 number를 number 필드에 저장
			this.client = client; // 매개변수 client를 client 필드에 저장
		}
	}

	// Room 객체 배열 선언, 인덱스 10개로 호텔 10개 저장
	Room[] rooms = new Room[10];

	public void add(int number, String client) {
		// 메서드 완성, 객실 번호보다 하나 작은 인덱스에 Room 객체 생성
		rooms[number - 1] = new Room(number, client);}

	public void show() {
		// 메서드 완성, 배열의 모든 원소를 처음부터 하나씩 Room 변수 r에 대입하며 반복
		for (Room r : rooms) {
			// 만약 r이 null로 초기화되어있지 않다면 객실 정보 출력
			if (r != null)
				System.out.println(r.number + "번 방을 " + r.client + "가 예약했습니다.");
		}}
}

public class HW2_HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();
	}
}