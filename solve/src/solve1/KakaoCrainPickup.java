package solve1;

import solve1.solution;

public class KakaoCrainPickup {
	
	public static void main(String[] args) {
		
		int[][] board = {{0, 0, 0, 3, 0, 0}, {0, 4, 3, 5, 5, 1}, {1, 2, 1, 1, 4, 4}, {2, 4, 2, 2, 2, 5}, {1, 4, 3, 3, 3, 3}};
		int[] moves = {1, 2, 3, 4, 5, 6, 1, 2, 3};
		
		int[][] boards = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int[] movess = {1, 5, 3, 5, 1, 2, 1, 4};
		
		int[][] board1 = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int[] moves1 = {1, 4, 3, 5, 1, 2, 1, 4};
		
		solution sol = new solution();
		
		int result = sol.solve(board, moves);
		
		System.out.println("return: " + result);
		
		int result1 = sol.solve(boards, movess);
		System.out.println("return2: " + result1);
		
		int result2 = sol.solve(board1, moves1);
		System.out.println("return: " + result2);
		
	}
}
