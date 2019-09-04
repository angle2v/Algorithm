package lv1;

public class Q02FindKimSeobangInSeoul {
	public static String findKim(String[] seoul) {
		// x�� �輭���� ��ġ�� �����ϼ���.
		String answer = "";

		String Kim = "Kim";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals(Kim)) {
				answer = "�輭���� " + i + "�� �ִ�";
				break;
			}
		}

		return answer;
	}

	public static String[] seoul = { "Jhan", "Kim" };

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		System.out.println(findKim(seoul));
	}
}

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
