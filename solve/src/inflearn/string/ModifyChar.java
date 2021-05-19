package inflearn.string;

import java.util.Scanner;
/*
	설명
	대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


	입력
	첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
	
	문자열은 영어 알파벳으로만 구성되어 있습니다.
	
	
	출력
	첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.



*/
public class ModifyChar {
	
	public String solution(String str) {
	   	//전달되어온 문자열을 문자로 분해
	    char[] strArr = str.toCharArray();
	    
	    //결과문자열
	    String answer = "";
	    
	    //대소문자 변환
	    for(int i=0; i<strArr.length; i++) {
	     if(Character.isUpperCase(strArr[i])) { //문자가 대문자라면
	     	answer += Character.toLowerCase(strArr[i]);
	     } else { //문자가 소문자라면
	    	answer += Character.toUpperCase(strArr[i]);
	     }
	    }
	    
	    return answer;
	  }
	  
	  public static void main(String[] args){
	    Scanner scn = new Scanner(System.in);
	    String str = scn.next();
	   	
	    ModifyChar main = new ModifyChar();
	    String result = main.solution(str);
	    System.out.println(result);
	  }
/*
 	   틀린 이유 : 
 	   	문자배열을 만들고 각각의 대소문자변환이 이루어진 문자를 그 문자배열에 넣고 최종적으로 그 문자배열을 String으로 바꾸는 방법을 취했다. 나쁜 방법은 아니지만
		메소드를 잘못썻다.
 	   	문자배열.toString()을 쓰는게 아니라 String.valueOf(문자배열); 을 썻어야 했다. ==>  자바 기본 API 클래스, 메소드에 대하여 숙지 부족 
 	 
 	 선생님 풀이 : 
 	 	문자열이 연산을 가능하다는 점을 이용, 빈문자열을 만들고 문자를 더해주었다. --> 이 방법이 코드도 간결하고 훨씬 좋다.
 */
}
