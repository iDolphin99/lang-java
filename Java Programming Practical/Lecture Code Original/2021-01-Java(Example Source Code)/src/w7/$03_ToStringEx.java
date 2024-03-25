/*
 Point 클래스에서 Point 객체를 문자열로 리턴하는 toString()메서드를 작성하라. 
 */

package w7;


class PPoint extends Point{
	public PPoint(int x, int y){
		super(x,y);
	}
	// class 내부에서 재정의, 
	public String toString() { 
		return "Point(" + x +  ", " + y + ")";
	}
}


public class $03_ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PPoint p = new PPoint(2,3);
		//System.out.println(p.toString()); 아래와 같은 의미 
		System.out.println(p);  		  // p는 toString()으로 자동 변환 
		System.out.println(p + "입니다.");  
	}

}
