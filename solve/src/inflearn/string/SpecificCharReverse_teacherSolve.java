package inflearn.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// lt와 rt를 이용하는 방법
/*  
   lt                rt
 	|                 |
 	a # b ! G E * T @ S ==> lt와 rt가 알파벳을 가르키고 있을때 만 둘을 교환해주고 lt++, rt--
 	
 		   -->
 		   
  	    lt        rt
 	    |         |
 	S # b ! G E * T @ a  ==> lt또는 rt가 가르키는게 알파벳이 아니면 교환안하고 넘어가기
 	
 		   -->
 		   
 		   lt rt
 	        | |
 	S # T ! G E * b @ a
 	
 		   -->
 		   
 		   rt lt
 	        | |
 	S # T ! E G * b @ a  ==> rt>lt 일때 반복문이 돌아가는건데 rt가 더 작아졌으니 반복문 종료한다.
 			
 	
 */
public class SpecificCharReverse_teacherSolve {
	
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt=0, rt=str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) { //문자가 알파벳인지 검증하는 정적메소드
				lt++;
			} else if(!Character.isAlphabetic(s[rt]) ) {
				rt--;
			} else {
				char tmp =s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(s);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		SpecificCharReverse_teacherSolve m = new SpecificCharReverse_teacherSolve();
		System.out.println(m.solution(str));
	}
}
