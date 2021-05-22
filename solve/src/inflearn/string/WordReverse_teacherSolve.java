package inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReverse_teacherSolve {
	// 1. 스트링빌드 이용해서 무작정 뒤집기(역순) 방법
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			//스트링 배열 요소 뒤집기
			String tmp = new StringBuilder(x).reverse().toString();
			// 스트링연산이 많아지면 스트링빌더를 쓰는게 가볍고 유익하다 (객체를 중복해서 생성 안해서)
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		WordReverse_teacherSolve T = new WordReverse_teacherSolve();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = scn.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
		
	}
}
