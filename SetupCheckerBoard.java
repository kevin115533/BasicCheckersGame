import CheckersPiece.*;
import Board.*;
import java.util.Scanner;

public class SetupCheckerBoard{
	public static void main (String[] args){
		final int count = 12;
		Scanner input1 = new Scanner(System.in);

			Board newGame = new Board();
			CheckersPiece[] blk = new CheckersPiece[count];	
			CheckersPiece[] red = new CheckersPiece[count];
			
			for(int i = 0;i<count;i++){
				red[i] = new CheckersPiece(Color.R,i);
			}
		
			for(int i = 0;i<count;i++){
				blk[i] = new CheckersPiece(Color.B,i);
			}
			
		for(int i = 0;i<8;i++){
				for(int j = 0;j<8;j++){
				if(j == 0 | j == 2){
					if(i == 1 | i == 3 | i == 5 | i == 7){
					newGame.setSpot(i,j,red[i]);}
						}
				if(j == 1){
					if(i == 0 | i == 2 | i == 4 | i == 6){
					newGame.setSpot(i,j,red[i]);}	
						}
					}
 				}
		
		newGame.printBoard();
	}
}