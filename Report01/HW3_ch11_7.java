/* HashSet, addAll(), containsAll() 사용하기 */

package Report01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HW3_ch11_7 {

	public static void main(String[] args) {
		String[] s1 = { "a", "b", "a", "b", "c" };
		String[] s2 = { "c" };

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		// 두개의 배열을 addAll() 메서드를 이용해 HashSet 객체 생성
		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);
		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2); // HashSet 객체 출력

		// 2개의 HashSet 객체가 동일한지를 비교하는 값 출력
		System.out.println("set1 과 set2는 같다 : " + (set1 == set2));
		// s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는지 출력
		System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));
		// 2개의 HashSet 합집합(set1을 합집합으로!), 교집합을 구한 후 출력
		set1.addAll(set2);
		System.out.println("합집합 : " + set1.toString());
		set1.retainAll(set2);
		System.out.println("교집합 : " + set1.toString());
	}

}