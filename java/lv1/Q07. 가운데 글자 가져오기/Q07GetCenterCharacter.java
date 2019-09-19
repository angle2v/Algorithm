package lv1;
public class Q07GetCenterCharacter{
	static String Center(String s) {
		String answer = "";
		if(s.length()%2 ==0) {
			answer = s.substring(s.length()/2 -1,s.length()/2 +1);
		}else {
			answer = String.valueOf(s.charAt(s.length()/2));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Center("Center"));
	}
}