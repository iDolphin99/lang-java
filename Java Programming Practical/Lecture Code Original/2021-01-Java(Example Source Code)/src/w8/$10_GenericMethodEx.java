// 9번의 MyStack -> GStack을 이용하여 주어진 스택의 내용을 반대로 만드는 메소드 reverse()를 작성하자 

package w8;

class GStack<T> {
	int idx;
	Object [] stck; 
	
	public GStack() {
		idx = 0;
		stck = new Object[10];}
	public void push(T item) {
		if (idx == 10) return; 
		stck[idx] = item;
		idx++;}
	public T pop() {
		if (idx == 0) return null;
		idx--;
		return (T)stck[idx];}
}

public class $10_GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> stack){
		GStack<T> newstack = new GStack<T>();
		
		while (true) {
			T tmp; 
			tmp = stack.pop();
			if (tmp == null) break;
			else newstack.push(tmp);}
		
		return newstack;}

	public static void main(String[] args) {
		// Double 타입의 GStack 생성 
		GStack <Double> gs = new GStack<Double> ();
		
		// 5개의 요소를 스택에 push 
		for (int i=0; i<5; i++)
			gs.push(new Double(i));
		
		// reverse함수를 이용하여 출력 
		gs = reverse(gs);
		for (int i=0; i<5; i++)
			System.out.println(gs.pop()); 
	}

}
