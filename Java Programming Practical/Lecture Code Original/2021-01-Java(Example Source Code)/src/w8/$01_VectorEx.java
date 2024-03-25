// 정수만 다루는 벡터를 생성하고, 활용하는 기본 사례를 보인다. 

package w8;

import java.util.Vector; 

public class $01_VectorEx {

	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성 
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		// 중간에 삽입하세요 
		v.add(2, 100);
		
		// 벡터가 가지고 있는 객체의 수와 용량을 출력하세요 
		System.out.println("벡터 내의 요소 객체 수: " + v.size());
		System.out.println("벡터의 현재 용량: " + v.capacity());
		
		// 컬렉션이 가지고 있는 모든 요소를 정수로 출력하세요 
		for (int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);}
		
		// 벡터 속의 모든 정수 더하기 
		int sum = 0;
		for (int i=0; i<v.size(); i++) {
			int n= v.elementAt(i);
			sum += n;}
		System.out.println("벡터에 있는 정수 합: " + sum);

	}

}
