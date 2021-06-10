package inflearn.string2;

import java.util.Scanner;

/*
 	설명
 	앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	단 회문을 검사할 때 대소문자를 구분하지 않습니다.
	
	입력
	첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
	
	출력
	첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
	
	입력예시 gooG -> 출력 : YES 
		  dse  -> 출력 : NO
 */
public class Palindrome {
	
	private String soloution(String str) {
		//대소문자를 구분하지 않으니까 받은 문자열을 소문자로 만들기
		String text = str.toLowerCase();
		
		//뒤집기 ----- sol1.
//		char[] textArr = text.toCharArray();
		String reversedText = "";
//		for(int i=textArr.length-1; i>=0; i--) {
//			reversedText += textArr[i];
//		}
		
		//StringBuffer 이용하기 ------ sol2.
		StringBuffer sb = new StringBuffer(text);
		reversedText = sb.reverse().toString();
	
	
		//판별
		if(text.equals(reversedText)) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		Palindrome pd = new Palindrome();
		Scanner scn = new Scanner(System.in);
		System.out.println(pd.soloution(scn.nextLine()));
	}
	/*
	 처음에 틀렸던 이유 :
	 	for(int i=textArr.length-1; i==0; i--)  여기서
	 	i==0 로 해두면 i가 0이여서 for문이 안돈다.. (i초기값; i범위; i의 증감여부) 인데 범위를 0으로만 해놓으니
	 	for문이 안도는 것이다....(초기값과 범위가 일치하지 않으니,, 일치하기라도 했다면 한번이라도 돌았을것이다)
	 */
}
