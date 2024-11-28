package a;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		
		Player xPlayer = new Player();
		Player yPlayer = new Player();
		
		xPlayer.setSymbol('X');
		while(true) {
		board.makeMove(1, 1, xPlayer.getSymbol());
		board.printBoard();	
		}
		
	}
}
