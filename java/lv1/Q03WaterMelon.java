package lv1;

public class Q03WaterMelon {

		public static String solution(int n) {
			String answer = "";

			String su = "수";
			String bak = "박";

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

/*programmers
class Solution {
    public String solution(int n) {
        String answer = "";
        
        String su = "수";
        String bak = "박";
        
        for(int i=1; i<=n; i++) {
            if(i%2!=0) {
                answer += su;
            } else {
                answer += bak;
            }
        }
        
        return answer;
    }
  }*/
  
