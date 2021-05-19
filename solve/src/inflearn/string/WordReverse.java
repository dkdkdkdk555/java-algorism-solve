package inflearn.string;

import java.util.Scanner;

/*
 	설명
	N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	
	입력
	첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
	두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

 */
public class WordReverse {
	
	public void solution(Object[] obj) {
		//전달받은 단어들 꺼내서 뒤집고 출력
		for(Object words : obj ) {
			String word = words.toString();
			StringBuffer sb = new StringBuffer(word);
			String reversedWord = sb.reverse().toString();
			
			System.out.println(reversedWord);
		}
		
	}
	
	public static void main(String[] args) {
		WordReverse wr = new WordReverse();
		
		Scanner scn = new Scanner(System.in);
		// 단어갯수 입력
		int n = scn.nextInt();
		// 전달할 배열 생성
		Object[] obj = new Object[n];
	
		// 단어갯수만큼 단어를 배열로 받음
		for(int i=0; i<n; i++) {
			System.out.print(i+"번째 단어 입력: ");
			 obj[i] = scn.next();
		}
		//solution 호출과 동시에 obj전달
		wr.solution(obj);
	}
}
