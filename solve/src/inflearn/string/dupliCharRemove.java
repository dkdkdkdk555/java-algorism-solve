package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 
 */
public class dupliCharRemove {
	public String solution(String str) {
		String answer="";
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i)+ "" + i + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) { // str.charAt(i) 가 처음으로 발견되는 인덱스와 str.charAt(i)의 현재위치와 같으면
				answer += str.charAt(i);
				
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		dupliCharRemove dcr = new dupliCharRemove();
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(dcr.solution(str));
	}
}
