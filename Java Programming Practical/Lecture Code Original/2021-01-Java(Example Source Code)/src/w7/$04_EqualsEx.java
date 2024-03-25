/*
 int 타입의 width(너비)와 height(높이) 필드를 가지는 Rect 클래스를 작성하고, 면적이 같으면
 두 Rect 객체가 같은 것으로 판별하는 equals()를 작성하라. 생성자에서 너비와 높이를 받아
 width, height 필드를 초기화하라
 */

package w7;


class Rect {
	private int width, height; 
	
	public Rect(int w,int h) {
		this.width = w; 
		this.height = h; }
	
	public boolean equals(Object obj) { // equals() 재정의 
		Rect o = (Rect)obj; // 다운캐스팅 
		if (width*height == o.width*o.height)
			return true; 
		else return false; 
	}
}

public class $04_EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if (a.equals(b)) 
			System.out.println("a is equals b");
		if (a.equals(c))
			System.out.println("a is equals c");
		if (b.equals(c))
			System.out.println("b is equals c");

	}

}
