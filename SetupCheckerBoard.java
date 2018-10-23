import CheckersPiece.*;
import Board.*;
import java.util.Scanner;

public class SetupCheckerBoard{
	public static void main (String[] args){
		int playerPiece,row;
		char userOpt, column;
		final int count = 12;
		boolean keepGoing = true;
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Play a game of checkers? y/n");
		userOpt = input1.next().charAt(0);
		
		
		if(userOpt == 'y'){
			Board newGame = new Board();
			//Color pieceColor; 
			
			for(int i = 0;i<8;i++){
				for(int j = 0;j<8;j++)
				newGame.setSpot(i,j,"__");
			}
			//loop to make all red pieces
			CheckersPiece[] red = new CheckersPiece[count];
			
			for(int i = 0;i<count;i++){
				red[i] = new CheckersPiece();
				if(i<4){
					red[i].makePiece("R"+ i,red[i].getxSpot(i),0);	
				}
				if(i>=4 && i<8){
					red[i].makePiece("R"+ i,red[i].getxSpot(i),1);
				}
				if(i>=8){
					red[i].makePiece("R"+ i,red[i].getxSpot(i),2);
				}
			}
			//loop to make black pieces
			CheckersPiece[] blk = new CheckersPiece[count];
			
			for(int i = 0;i<count;i++){
				blk[i] = new CheckersPiece();
				if(i<4){
					blk[i].makePiece("B"+ i,blk[i].getxSpot(i),5);	
				}
				if(i>=4 && i<8){
					blk[i].makePiece("B"+ i,blk[i].getxSpot(i),6);
				}
				if(i>=8){
					blk[i].makePiece("B"+ i,blk[i].getxSpot(i),7);
				}
			}
			
			//sets create piece objects to spots on board
			for(int i = 0;i<count;i++){
				newGame.setSpot(red[i].getxPos(),red[i].getyPos(),red[i].getColor());
				newGame.setSpot(blk[i].getxPos(),blk[i].getyPos(),blk[i].getColor());
			}
			
			
			
			while (keepGoing == true){
				newGame.printBoard();
				
				System.out.println("Black Player turn. Pick a piece number to move: ");
				playerPiece = input1.nextInt();
				blk[playerPiece].printPiece();
				System.out.println("Enter coordinates to move to. Example: D 3");
				column = input2.next().charAt(0);
				row = input2.nextInt();
				newGame.makeMove(column, row, blk[playerPiece].getColor());
				
				newGame.printBoard();
				
			}
			
						}
			}
 }