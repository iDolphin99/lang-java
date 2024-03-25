/*
* 5-12: 본문(5.6절과 5.7절)에서 사례로 든 추상 클래스 Shape와 Line, Rect, Circle 클래스 코드를 활용하여 아래 실행 예시 처럼 
* "삽입", "삭제", "모두 보기", "종료"의 4가지 기능을 수행하는 GrapicEditor 클래스 작성.

* 삭제할 시 index 번호는 0번부터 세도록 작성하였습니다!  
*/

package Report02;

import java.util.Scanner;

//추상클래스
abstract class Shape {
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} // 링크 연결
	public Shape getNext() {return next;}
	public abstract void draw();
}


class Circle extends Shape {
	@Override
	public void draw() {
		 System.out.println("Circle");}}


class Line extends Shape {
	@Override
	public void draw() {
		 System.out.println("Line");}}


class Rect extends Shape {
	@Override
	public void draw() {
		 System.out.println("Rect");}}


/*********** 필요하다면 메소드 추가 가능-> print() 메서드 추가 **************/
class GraphicEditor {  
	//필드 선언
	public String name; 
	private Shape head, tail;           
	Scanner sc = new Scanner(System.in);

	//생성자 작성
	public GraphicEditor(String name) {
		this.name = name;
		head = null;  //head Node
		tail = null;  //tail Node
	}

	public void run() {
		System.out.println("그래픽 에디터 " + name + "을 실행합니다.");
		
		while(true) {
		System.out.println("\n삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
		int op = sc.nextInt();
		
		switch (op) {
		//삽입
		case 1: 
			System.out.println("Line(1), Rect(2), Circle(3)>>");
			op = sc.nextInt();
			insert(op);
			break;
		//삭제
		case 2: 
			System.out.println("삭제할 도형의 위치>>");
			op = sc.nextInt();
			boolean flag = delete(op);
			if (flag==false) //flag가 false인 경우 삭제 실패
				System.out.println("삭제할 수 없습니다.");
			break;
		//모두보기
		case 3 :
			print();
			break;
		//종료
		case 4: 
			System.out.println("\n" + name + "을 종료합니다.");
			sc.close();  //Scanner 객체 닫아주기! 
			return; }	}
	}

	//삽입 메서드
	private void insert(int choice) {
		 Shape grapic;
	      switch(choice) {
	      case 1:
	         grapic = new Line();
	         break;
	      case 2:
	         grapic = new Rect();
	         break;
	      case 3:
	         grapic = new Circle();
	         break;
	      default:
	         System.out.println("다시 입력해 주세요.");
	         return;}
	      
	      if(head == null) { // head가 아무것도 가리키지 않으면
	         head = grapic;  // head랑 tail이 새로운 노드를가리킴
	         tail = grapic;}
	      else {
	         tail.setNext(grapic); // tail에 새로운 노드를 연결하고,
	         tail = grapic;}       // tail은 새로 만들어진 노드를 가리키게 함 
	}
	
	//삭제 메서드
	private boolean delete(int index) {
		boolean flag = true; //해당 메서드의 반환 타입이 boolean이므로 추가한 변수, false일 경우 삭제 실패 
	    Shape now = head;    //현재 노드
	    Shape tmp = head;
	      
	    //애초에 노드가 없을 경우
    	if (head == null)
    		return false;
	    
	    //첫번째 Node를 삭제할 경우 
	    if(index == 0) { 
	    	//노드가 한개 일경우 
	    	if(head == tail) { 
	    		head = null;
	            tail = null; }
	        //노드가 두개 이상
	        else 
	            head = head.getNext(); }
	    
	    //노드의 이동 
	    for(int i=1; i<=index; i++) {
	    	tmp = now;               // 현재 노드를 저장 후 
	    	now = now.getNext();     // 다음 노드로 이동, tmp는 이전 노드를 저장하게 됨 
	         
	        //노드 수가 입력 값보다 적을때 -> 삭제실패
	        if(now == null) {
	        	return false;		}}
	      
	        //끝 노드를 가리킬때
	        if(now==tail) { 
	        	tmp.setNext(null);  //now노드는 삭제 
	        	tail = tmp;	}		//대신 tmp노드가 tail이 됨
	        else 					//끝노드가 아니라면 이전노드가 다음 노드를 가리킴 (즉, 현재 노드 now 삭제)
	        	tmp.setNext(now.getNext()); 
	      
	    return flag; 
	   }

	//출력 메서드 
	public void print() {
		Shape tmp = head;
		
		//출력할 도형이 없다면 >> 예외 처리
		if(tmp==null) 
			System.out.println("출력할 도형이 없습니다.");
		else {
			while(true) {
				tmp.draw();
				if (tmp==tail)	return;   //출력할 도형이 tail일때까지 반복 
				tmp = tmp.getNext();}
			}
		System.out.println();	}
}


public class HW2_Practice5_12 {
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();
	}
}
