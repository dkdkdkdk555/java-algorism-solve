package solve3_referenceType;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo<1 || selectNo>5) {
				continue;
			}
			
			if(selectNo == 1) {
				System.out.print("학생 수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; //점수배열 생성
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i]= scanner.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if(selectNo == 4) {
				int sum = 0;
				double avg = 0.0;
				int max = 0;
				for(int i=0; i<scores.length; i++) {
					int f = scores[i];
					if(f>max) {
						max = f;
					}
					
					sum += scores[i];
				}
				
				avg = (double) sum/scores.length;
				
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			} else if(selectNo == 5) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
