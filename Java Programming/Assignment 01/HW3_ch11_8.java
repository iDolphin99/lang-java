/* ArrayList Collection을 사용한 배열 생성 후 Collection method 사용하기 */

package Report01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HW3_ch11_8 {

	public static void main(String[] args) {
		String[] s = { "독수리", "고양이", "강아지" };
		// 조건에 맞는 ArrayList생성 - requirements
		List<String> list = new ArrayList<String>(Arrays.asList("개미", "개미"));
		System.out.println(list);
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);// 복사 된 al1리스트 생성

		// 리스트의 모든 원소를 '벌'로 덮어쓰고 출력
		Collections.fill(al1, "벌");
		System.out.println("'벌'을 채운 후 : " + al1);
		// s를 al1에 추가해서 출력
		Collections.addAll(al1, s);
		System.out.println("리스트를 모두 추가한 후 : " + al1);
		// 리스트 무작위로 나열하여 출력
		Collections.shuffle(al1);
		System.out.println("리스트를 섞은 후 : " + al1);
		// 리스트 역순 정렬 후 출력
		Collections.reverse(al1);
		System.out.println("리스트를 역순으로 정렬한 후 : " + al1);
		System.out.println("리스트에서 최소 : " + Collections.min(al1));				  // Collections모듈 이용해 리스트 최소값 출력
		System.out.println("리스트에서 최대 : " + Collections.max(al1));				  // Collections모듈 이용해 리스트 최대값 출력
		System.out.println("리스트에서 벌의 빈도 : " + Collections.frequency(al1, "벌"));// 해당 리스트의 '벌' 원소의 빈도수 출력
	}
}