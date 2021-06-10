package inflearn.string;

import java.util.Scanner;

public class findChar_mysolve {
	
	public int solution(String[] str) {
		String stgg = str[0];
		String stg = stgg.toLowerCase();
		char[] stgarr = stg.toCharArray();
		char chh = str[1].charAt(0);
		int count = 0;
		for(char ch : stgarr) {
			if(ch == chh) {
				count++;
			}
		}
		
		return count;
	}

	
	public static void main(String[] args) {
		findChar_mysolve fm = new findChar_mysolve();
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String c = scn.nextLine();
		String[] strarr = new String[2];
		strarr[0] = str;
		strarr[1] = c;
		System.out.println(fm.solution(strarr));
		
	}
}
