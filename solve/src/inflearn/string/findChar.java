package inflearn.string;

import java.util.Scanner;
/*
 	설명
	한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	
	대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	
	
	입력
	첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
	
	문자열은 영어 알파벳으로만 구성되어 있습니다.
	
	
	출력
	첫 줄에 해당 문자의 개수를 출력한다.
 
 */
public class findChar {
	public int solution(String str, char c) { // 전달할 문장, 찾을 문자
		int answer = 0;
		str=str.toUpperCase(); //대소문자구분안하니까 걍 다 대문자로 만들어버리자
		c = Character.toUpperCase(c); // 전달받은 문자도 대문자로 만들기
		char[] strarr = str.toCharArray(); 
		for(char tmp : strarr ) { // 향상된 for문의 우항에는 컬렉션이나 배열만 올 수 있다.
			// for(char tmp :  str.toCharArray()) {  이것도 된다.
			if(tmp==c) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		findChar fc = new findChar();
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char c = scn.next().charAt(0);
		
		System.out.println(fc.solution(str, c));
		
	}
}
