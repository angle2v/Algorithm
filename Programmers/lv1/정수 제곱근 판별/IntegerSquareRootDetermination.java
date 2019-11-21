package lv1;

public class IntegerSquareRootDetermination {
	/*정수 제곱근 판별
	 * 
	 * 문제 설명
	 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	 * 입출력 예#1
	 * 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
	 * 입출력 예#2
	 * 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
	 * 
	 * 느낀점
	 * 이문제는 Math 함수중 sqrt함수와 pow함수를 사용할줄 아는지 채크하는 문제라고 느꼈다.
	 * 
	 */
	public long solution(long n) {
		long result = 0;
		long sqrt = (long) Math.sqrt(n);
		if (Math.pow(sqrt, 2) == n) {
			result = (long) Math.pow(sqrt + 1, 2);
		} else {
			result = -1;
		}
		return result;
	}

	public static void main(String[] args) {
		IntegerSquareRootDetermination isrd = new IntegerSquareRootDetermination();
		System.out.println(isrd.solution(121));
	}
}