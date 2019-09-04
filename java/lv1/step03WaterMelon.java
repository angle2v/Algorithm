package lv1;

public class step03WaterMelon {

		public static String solution(int n) {
			String answer = "";

			String su = "¼ö";
			String bak = "¹Ú";

			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					answer += su;
				} else {
					answer += bak;
				}
			}

			return answer;
		}

	public static void main(String[] args) {
		System.out.println(solution(5));
	}
}
