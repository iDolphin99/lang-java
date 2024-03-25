/*
 객체 레퍼런스로 객체의 클래스 명, 해시코드 값, 객체의 문자열을 출력해보자 
 */

package w7;


class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;}

}

public class $02_ObjectPropertyEx {
	public static void print(Object obj) { // 업캐스팅 
		System.out.println(obj.getClass().getName());  // 객체에 대한 정보를 얻은 후, 정보의 클래스 이름을 반환 -> 클래스 이름 반환 
		System.out.println(obj.hashCode());			   // 객체의 고유한 정수 값, 해시코드 값 
		System.out.println(obj.toString());			   // 객체를 문자열 형태의 정보로 반환 
		System.out.println(obj);					   // 객체를 출력, 자동으로 toString()을 호출해줌 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2,3);
		print(p);
	}

}
