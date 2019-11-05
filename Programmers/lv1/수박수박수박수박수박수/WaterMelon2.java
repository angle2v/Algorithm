package watermelon;

public class Test2 {
	public String solution(int n) {

		return new String(new char[n/2+1]).replace("\0", "수박").substring(0, n);
	}

	public static void main(String[] args) {
		Test2 test = new Test2();
		System.out.println(test.solution(2));
	}

}
