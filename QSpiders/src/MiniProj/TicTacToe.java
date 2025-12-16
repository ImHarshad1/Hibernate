package MiniProj;

import java.util.Scanner;

public class TicTacToe {
	
	static char[][] board= {
			{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '}
	};
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			printBoard();
			System.out.print("Enter position (1-9) for Player X: ");
			int posX=sc.nextInt();
			placemove(posX,'X');
			if(checkWinner('X')) {
				printBoard();
				System.out.println("player X wins!");
				break;
			}
			
			printBoard();
			System.out.print("Enter position (1-9) for Player O: ");
			int posO=sc.nextInt();
			placemove(posO,'O');
			if(checkWinner('O')) {
				printBoard();
				System.out.println("Player O wins");
				break;
			}
		}
		sc.close();
	}
	public static void printBoard() {
		for(char[] row :board) {
			for(char c:row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void placemove(int pos, char symbol) {
		switch(pos) {
		case 1 -> board[0][0]=symbol;
		case 2 -> board[0][2]=symbol;
		case 3 -> board[0][4]=symbol;
		case 4 -> board[2][0]=symbol;
		case 5 -> board[2][2]=symbol;
		case 6 -> board[2][4]=symbol;
		case 7 -> board[4][0]=symbol;
		case 8 -> board[4][2]=symbol;
		case 9 -> board[4][4]=symbol;
		default -> System.out.println("Invalid Position");
		}
	}
	
	public static boolean checkWinner(char symbol) {
		//rows
		if((board[0][0] == symbol && board[0][2] == symbol && board[0][4] == symbol) 
			|| (board[2][0] == symbol && board[2][2] == symbol && board[2][4] == symbol)
			|| (board[4][0] == symbol && board[4][2] == symbol && board[4][4] == symbol)
			//columns
			|| (board[0][0] == symbol && board[2][0] == symbol && board[4][0] == symbol)
			|| (board[0][2] == symbol && board[2][2] == symbol && board[4][2] == symbol)
			|| (board[0][4] == symbol && board[2][4] == symbol && board[4][4] == symbol)
			//Diagonals
			|| (board[0][0] == symbol && board[2][2] == symbol && board [4][4] == symbol)
			|| (board[0][4] == symbol && board[2][2] == symbol && board[0][4] == symbol)) {
			return true;
		}
	return false;	
	}
}






















