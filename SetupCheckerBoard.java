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
			
		/*for(int i = 0;i<count;i++){
				for(int j = 0;j<count;j++){
				if(j == 0 | j == 2){
					if(i == 1 | i == 3 | i == 5 | i == 7){
					newGame.setSpot(i,j,red[i]);}
						}
				if(j == 1){
					if(i == 0 | i == 2 | i == 4 | i == 6){
					newGame.setSpot(i,j,red[i]);}	
						}
					}
 				}*/
		
		/*for(int i = 0;i<count;i++){
			newGame.setSpot(i,j,red[i]);
 				}*/
		
		newGame.setSpot(1,0,red[0]);
		newGame.setSpot(3,0,red[1]);
		newGame.setSpot(5,0,red[2]);
		newGame.setSpot(7,0,red[3]);
		newGame.setSpot(0,1,red[4]);
		newGame.setSpot(2,1,red[5]);
		newGame.setSpot(4,1,red[6]);
		newGame.setSpot(6,1,red[7]);
		newGame.setSpot(1,2,red[8]);
		newGame.setSpot(3,2,red[9]);
		newGame.setSpot(5,2,red[10]);
		newGame.setSpot(7,2,red[11]);
		
		newGame.printBoard();
	}
}