// 스택을 제네릭 클래스로 작성하고, 
// String과 Integer형 스택을 사용하는 예를 보여라. 

package w8;

import java.util.*;


class MyStack<T> {
	int tos;
	Object [] stck; 
	
	public MyStack() {
		tos = 0;
		stck = new Object[10];}
	public void push(T item) {
		if (tos == 10) return; 
		stck[tos] = item;
		tos++;}
	public T pop() {
		if (tos == 0) return null;
		tos--;
		return (T)stck[tos];}
}


public class $09_MyStack {

	public static void main(String[] args) {
		// String으로 구체화한 제네릭 클래스를 생성하라 
		MyStack<String> stringStack = new MyStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for (int i =0;i<3;i++)
			System.out.println(stringStack.pop());
		
		// Integer으로 구체화한 제네릭 클래스를 생성하라  
		MyStack<Integer> intStack = new MyStack<Integer>();
		intStack.push(5);
		intStack.push(3);
		intStack.push(1);
		
		for (int i=0; i<3; i++)
			System.out.println(intStack.pop());
	}

}
