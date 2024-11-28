package a;

public class Board {
private char[][] board;


public void Board() {
	board = new char[3][3];
	for(int i=0; i<3; i++) {
		for(int j = 0 ; j < 3 ; j++) {
			board[i][j] = ' ';
		}
	}
}

public void printBoard() {
	 for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             System.out.print(board[i][j] + " ");
             if (j < 2) System.out.print("| ");
         }
         System.out.println();
         if (i < 2) System.out.println("---------");
     }
}

public void makeMove(int x,int y, char symbol) {
	board[x][y] = symbol;
}

public boolean isValidMove(int x , int y) {
	return board[x][y] == ' ' && x < 4 && y <4;
}

public boolean isWin() {
	return false;
}

public boolean isFull() {
	return false;
}





}
