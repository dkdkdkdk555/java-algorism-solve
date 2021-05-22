package inflearn.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 	설명
	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	
	
	입력
	첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
	
	
	출력
	첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
	
	예시 
	a#b!GE*T@S -->  S#T!EG*b@a
 */
public class SpecificCharReverse {
	
	public String solution(String str) {
		//문자열을 문자배열로 만든다.
		char[] arr = str.toCharArray();
		//문자배열에서 알파벳만 빼낸다.
		List<Character> alphabet = new ArrayList<Character>();
		for(char ch : arr) {
			if(ch >= 'A'&& ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				Character st = ch; // 알파벳이면 알파벳 리스트에 
				alphabet.add(st);
			} 
		}
		
		//알파벳 뒤집기
		Collections.reverse(alphabet);
		
		//List에 있는 뒤집힌 알파벳을 차례로 넣기 위해
		int num = -1;
		
		// char배열에 알파벳있는 자리에다 뒤집은거로 바꾸기
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 'A'&& arr[i] <= 'Z' || arr[i] >= 'a' && arr[i] <= 'z') { //알파벳이면
				num++;
				arr[i] = alphabet.get(num);
			} 
		}
		
		//결과를 String으로 변환
		String result = "";
		for(char chrr : arr) {
			result += chrr;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String result = new SpecificCharReverse().solution(str);
		System.out.println(result);
	}
	/*
	 처음 풀이가 막혔던 이유 : 
	 	이중 for문에서 외부for문이 한번 돌때 내부for문은 모든 회차를 다돈다는사시을 간과;;
	 	
	 */
}
