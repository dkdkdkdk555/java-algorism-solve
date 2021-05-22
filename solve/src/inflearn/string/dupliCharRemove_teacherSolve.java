package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 	설명
	소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
	중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
	
	
	입력
	첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
	
	
	출력
	첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
public class dupliCharRemove_teacherSolve {
	public String solution(String str) {
		//받은문자열을 문자배열로 변환
		char[] arr = str.toCharArray();
		
		//중복을 제거하고 새로 담을 배열
		List<Character> newArr = new ArrayList<Character>(); 
		
		//받은문자열을 for문으로 돌리면서 중복을 제거하고 newArr에 새로 담기
		for(int i=0; i<arr.length; i++) {
			if(newArr.contains(arr[i])) {
				continue;
			} else {
				newArr.add(arr[i]);
			}
		}
		
		String answer="";
		
		//newArr을 문자열로 만들기
		for(char chrr : newArr) {
			answer += chrr;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		dupliCharRemove_teacherSolve dcr = new dupliCharRemove_teacherSolve();
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(dcr.solution(str));
	}
}
