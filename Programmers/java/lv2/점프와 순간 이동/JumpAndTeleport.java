package lv2;

public class JumpAndTeleport {

	public int solution(int n) {
		int ans = 1; // 건전지 사용량 == 점프 거리 (건전지 사용량은 무조건 1부터 시작)
		int dst = n; // 남은거리 (n값(총이동거리)를 받아 1까지 가야하기에)

		while (dst > 1) { // 남은거리가 1보다 크면 반복, 1되면 끝
			if (dst % 2 == 0) { // 2로 나누어 떨어지면?	(짝수라면?)
				dst /= 2;
			} else { // 아니면?	(홀수라면?)
				dst--; // 남은거리에서 -1(점프하나 사용) 하여 짝수로 만들어주기 위함
				ans++; // 점프하나 사용
			}
		}
		return ans;
	}

	public static void main(String[] args) {
//		입출력 예
//		n result
//		5	2
//		6	2
//		5000	5
//		n값이 1231252812라면?  건전지 사용량 : 15
		JumpAndTeleport jat = new JumpAndTeleport();
		System.out.println("n : 5 \t result : " + jat.solution(5));
		System.out.println("n : 6 \t result : " + jat.solution(6));
		System.out.println("n : 5000 \t result : " + jat.solution(5000));
		System.out.println("n : 1231252812 \t result : " + jat.solution(1231252812)); // 스마트하군
	}
}
