/*문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1
수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
입출력 예 #2
모든 사람이 2문제씩을 맞췄습니다.*/
package lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class MockTest {

	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] a = { 1, 2, 3, 4, 5 }; // 수포자 A
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 }; // 수포자 B
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; // 수포자 C
		int[] cnt = new int[3]; // 3명의 학생이므로 정답을 체크하기 위한 배열 cnt 생성
		int max = 0;
		ArrayList<Integer> rank = new ArrayList<>();
//		int max = 0;
		// 반복문과 조건문을 통해 answers 배열의 값(정답)과 학생 a,b,c의 정답 비교 후 cnt배열에 삽입
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % 5]) {
				cnt[0]++;
			}
			if (answers[i] == b[i % 8]) {
				cnt[1]++;
			}
			if (answers[i] == c[i % 10]) {
				cnt[2]++;
			}
		}
		// max라는 int 타입 변수 선언 max 변수에 Math.max 라는 메소드를 사용 하여 최고 점수를 식별
		max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
		// cnt 의 index 0,1,2 를 최고점수와 비교하여 최고점수와 동일한 값을 가지고 있는 인덱스를 rank ArrayList에 적재
		if (cnt[0] == max) {
			rank.add(1);
		}
		if (cnt[1] == max) {
			rank.add(2);
		}
		if (cnt[2] == max) {
			rank.add(3);
		}
		// int [] 변수 answer의 길이를 rank의 size로 동일하게 만들어줌
		answer = new int[rank.size()];
		// 반복문으로 answer에 ArrayList에 담긴 데이터를 적재
		for (int i = 0; i < answer.length; i++) {
			answer[i] += rank.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		MockTest mt = new MockTest();
//		Programmers 입출력 예
//		answers	return
//		[1,2,3,4,5]	[1] 
//		[1,3,2,4,2]	[1,2,3]
//		int[] answers = { 1, 2, 3, 4, 5 }; 
		int[] answers = { 1, 3, 2, 4, 2 };
		System.out.println(Arrays.toString(mt.solution(answers)));
	}
}
