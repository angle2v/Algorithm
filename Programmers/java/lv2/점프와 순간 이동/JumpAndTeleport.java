package test;

public class JumpAndTeleport {

	public int solution(int n) {
		int ans = 1; // 건전지 사용량 == 점프 거리
		int dst = n; // 남은거리

		while (dst > 1) { // 남은거리가 1보다 크면 반복, 1되면 끝
			if ((dst % 2) == 0) { // 2로 나누어 떨어지면?
				dst /= 2;
			} else { // 아니면?
				dst--;
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		JumpAndTeleport w = new JumpAndTeleport();
		System.out.println(w.solution(3));
	}
}
