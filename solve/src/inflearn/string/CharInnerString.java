package inflearn.string;

import java.util.Scanner;
/*
 	설명
	한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
	문장속의 각 단어는 공백으로 구분됩니다.
	
	
	입력
	첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
	
	
	출력
	첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
	
	단어를 답으로 합니다.
 */

public class CharInnerString {
	
//	public String solution(String str) {
//		//문자열 받으면 공백으로 구분
//		String[] array = str.split(" ");
//		int size = 0;
//		String answer = "";
//		
//		for(int i=0; i<array.length; i++) {
//			int arrlength = array[i].length();
//			if(arrlength > size) {
//				size = arrlength;
//				answer = array[i];
//			}
//		}
//		
//	
//		return answer;
//	}
//	
//	public static void main(String[] args) {
//		 Scanner scn =new Scanner(System.in);
//		 String str = scn.nextLine();
//		 Main cis = new Main();
//	 	System.out.println(cis.solution(str));
//	}
	
	/*
	 	틀린 이유 : 
	 		java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 ,  문장이 제대로 입력되지 않았거나 제대로 배열이 되지 못했다.
	 	해결 : 
	 		scn.next() 를 nextLine()으로 바꿔야 공백포함된 문장을 읽을 수 있다.
	 */
	
	//선생님 풀이 
	public String solution(String str) {
		String answer = ""; //결과 문자열을 넣을 변수
		int m = Integer.MIN_VALUE; // 최댓값을 넣어야 하니까 처음엔 가장 작은 값을 넣어준다.가장작은 값으로 초기화됨 
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length(); //각각의 단어 길이가 들어감
			if(len > m) { // 최대값 구하는 알고리즘
				m = len;
				answer = x;
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		CharInnerString cis = new CharInnerString();
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(cis.solution(str));
	}
}
