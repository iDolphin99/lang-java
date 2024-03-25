// 1번 코드를 Iterator<Integer> 를 이용하여 수정하여라 


package w8;

import java.util.Iterator;
import java.util.Vector;

public class $04_IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		// 중간에 삽입하세요 
		v.add(2, 100);
		
		// Iterator를 사용하여 모든 정수 출력하기 
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);}
		
		// Iterator를 사용하여 벡터 속의 모든 정수 더하기 -> Unboxing
		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: " + sum);
		
		
	}

}
