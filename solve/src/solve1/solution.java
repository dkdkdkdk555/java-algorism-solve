package solve1;

import java.util.ArrayList;

import java.util.List;

public class solution {
	
    public int solve(int[][] board, int[] moves) {
    	List<Integer> bag = new ArrayList<Integer>(); //바구니
            
        //크레인 움직여서 장바구니에 담는 로직
        for(int i=0;i<moves.length;i++) {
            int move1 = moves[i];
            int move = move1 -1;
            for(int j=0; j<board.length; j++) { //행의 길이
                int pick = board[j][move]; //크레인이 열에서만 움직이니 각행의 열만 검사한다.
                if(pick!=0) { // 해당 행의 열이 0이 아니라면
                    bag.add(pick); // 바구니안에 담는다.
                    board[j][move]=0; // 집은인형이 있던 자리는 0으로 만든다
                    break; //해당 열에서 집었다면 크래인을 이동시킨다.
                }              
            }
        }
        
        int count = 0; // 깨트려진 인형의 갯수
        //장바구니에 있는거 같은수면 깨트려서 없에는 로직
        int i = 0;
        while(true) {
        	
        	if(i==(bag.size()-1)) { //모든 인덱스에 대해 검사를 마쳤다면 반복문을 빠져나온다.
        
 
        		break;
        	}
        	
        	if(bag.get(i)==bag.get(i+1)) { //현재인덱스와 다음인덱스가 값이 같다면
        		int rm1 = bag.remove(i); 
        		int rm2 = bag.remove(i); //list에서 제거하고
        		System.out.println(rm1 + ", " + rm2);
        		count+=2; // 없엔 인형의 갯수만큼 count를 더한다.
        		i = 0; //list배열의 인덱스가 앞당겨졌으니 처음부터 다시 검사하기위해 i=0으로 만든다.
        	} else {
        		i ++; // 현재인덱스와 다음인덱스와의 값이 같지 않다면 그 다음 인덱스와 다다음인덱스에 대해 검사하기위해
        	}
        	
        }
        
        
        return count;
    }
}