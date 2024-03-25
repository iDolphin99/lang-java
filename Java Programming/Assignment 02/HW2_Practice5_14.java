/*
* 5-14: main()과 실행 결과를 참고하여  Shape 인터페이스를 구현한 Circle, Oval, Rect 를 작성하여, 전체 프로그램 완성.
*/

package Report02;

interface Shape2 {
	final double PI = 3.14;
	void draw();      // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	// default method
	default public void redraw() { 
		System.out.print("--- 다시 그립니다. ");
		draw();	
	}
}

class Circle2 implements Shape2 {
	//필드, r:반지름
	private int r; 
	
	//생성자
	Circle2(int r){this.r = r;}
	
	//인터페이스 메서드 구현, Override
	@Override
	public void draw() {System.out.println("반지름이 "+ r +"인 원입니다.");}
	@Override
	public double getArea() { return r*r*PI;}
}

class Oval2 implements Shape2 {
	//필드, w:가로, h:세로
	private int w,h; 
		
	//생성자
	Oval2(int w, int h){this.w = w;	this.h = h;}
		
	//인터페이스 메서드 구현, Override
	@Override
	public void draw() {System.out.println(w+"x"+h +"에 내접하는 타원입니다.");}
	@Override
	public double getArea() { return w*h*PI;}
}

class Rect2 implements Shape2 {
	//필드, w:가로, h:세로
	private int w,h; 
			
	//생성자
	Rect2(int w, int h){this.w = w;	this.h = h;}
			
	//인터페이스 메서드 구현, Override
	@Override
	public void draw() {System.out.println(w+"x"+h +"크기의 사각형입니다.");}
	@Override
	public double getArea() { return w*h;}
}



public class HW2_Practice5_14 {

	public static void main(String[] args) {
		Shape2 [] list = new Shape2[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle2(10);      // 반지름이 10인 원 객체
		list[1] = new Oval2(20, 30);    // 20x30 사각형에 내접하는 타원
		list[2] = new Rect2(10, 40);    // 10x40 크기의 사각형
		
		for(int i=0; i<list.length; i++) 
			list[i].redraw();

		for(int i=0; i<list.length; i++) 
			System.out.println("면적은 " + list[i].getArea());
	}
}
