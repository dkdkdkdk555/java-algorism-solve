package inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReverse_teacherSolve2 {
	// 2. 목록의 양끝끼리 교환하는 식으로 뒤집는 방법(lt와 rt를 교환하는 방법)
	
	/* $:lt,  %: rt
	 가$ 나 다 라 마%->  마 나$ 다 라% 가 -> 마 라 다$% 나 가 
	 */
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		WordReverse_teacherSolve2 T = new WordReverse_teacherSolve2();
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
