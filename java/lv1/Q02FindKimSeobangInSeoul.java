package lv1;

public class Q02FindKimSeobangInSeoul {
	public static String findKim(String[] seoul) {
		// x에 김서방의 위치를 저장하세요.
		String answer = "";

		String Kim = "Kim";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals(Kim)) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}

		return answer;
	}

	public static String[] seoul = { "Jhan", "Kim" };

	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		System.out.println(findKim(seoul));
	}
}

<<<<<<< HEAD:java/lv1/Q02FindKimSeobangInSeoul.java
/*programmers
class Solution {
	public String solution(String[] seoul) {
		String answer = "";

		int x = 1;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i] == "Kim") {
				x = i;
			}
		}
		return "�輭���� " + x + "�� �ִ�";
	}
}*/
=======
/*
 * programmers class Solution { public String solution(String[] seoul) { String
 * answer = "";
 * 
 * int x = 1; for (int i = 0; i < seoul.length; i++) { if (seoul[i] == "Kim") {
 * x = i; } } return "김서방은 " + x + "에 있다"; } }
 */
>>>>>>> c0e0bc360ccba40d6d02795daaaec8a89fde2539:java/lv1/step02FindKimSeobangInSeoul.java
