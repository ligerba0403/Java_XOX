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
	board[x-1][y-1] = symbol;
}

public boolean isValidMove(int x , int y) {
	return board[x][y] == ' ' && x < 4 && y <4;
}

public boolean isWin(char player) {
	for(int x = 0; x < 3 ; x++) {
		if(board[0][x] == player && board[1][x] == player && board[2][x] == player) {
			return true;
		}
	}
	for(int x = 0; x < 3 ; x++) {
		if(board[x][0] == player && board[x][1] == player && board[x][2] == player) {
			return true;
		}
	}
	
	   // Çaprazları kontrol et
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
        return true;
    }

    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
        return true;
    }

	return false;

}

public boolean isFull() {
	 for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             if(board[i][j] == ' ') {
            	 return true;
             }
         }
     }
	return false;
}





}
