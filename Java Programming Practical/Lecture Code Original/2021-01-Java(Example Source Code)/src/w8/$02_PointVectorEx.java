// 점(x,y)를 표현하는 Point 클래스를 만들고, Point의 객체만 다루는 벡터를 작성하라 

package w8;

import java.util.Vector;


class Point {
	private int x,y; 
	public Point(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
}


public class $02_PointVectorEx {

	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 벡터 생성 
		Vector<Point> v = new Vector<Point> ();
		
		// 3개의 Point 객체 삽입 
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		// 인덱스 1의 객체 삭제 
		v.remove(1);
		
		// 벡터에 있는 모든 Point 객체 검색하여 출력 
		for (int i=0; i<v.size(); i++) {
			String str = v.get(i).toString();
			System.out.println(str);
			
			// Point p = v.get(i);
			// Sysout(p) -> p.toString()
		}
	}

}
