package myJava0524;

import java.util.*;

/*
 * 1~50사이의 숫자 중에서 25개를 골라서 5X5 크기의 빙고판을 만드는 예제 
 * 
 */
public class Bingo {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		int[][] board = new int[5][5];
		for(int i =0; set.size()<25;i++) {
			set.add((int)(Math.random()*50)+1+"");// 1~50사이의 숫자 랜덤으로 뽑는다. 
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length;i++) {
			for(int j =0; j<board[i].length; j++) {
				board[i][j] =Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10? "  ":" ")+board[i][j]);
			}
			System.out.println();
		}
	}

}
