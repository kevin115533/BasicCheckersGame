import CheckersPiece.*;
import Board.*;
import java.util.Scanner;

public class SetupCheckerBoard{
	public static void main (String[] args){
		final int count = 12;
		Scanner input1 = new Scanner(System.in);

			Board newGame = new Board();
			CheckersPiece[] black = new CheckersPiece[count];	
			CheckersPiece[] red = new CheckersPiece[count];
			
			for(int i = 0;i<count;i++){
				red[i] = new CheckersPiece(Color.R,i);
			}
		
			for(int i = 0;i<count;i++){
				black[i] = new CheckersPiece(Color.B,i);
			}
		
		//manually setting peices on board. Dont think theres a loop that could condense it down.
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
		
		newGame.setSpot(0,5,black[0]);
		newGame.setSpot(2,5,black[1]);
		newGame.setSpot(4,5,black[2]);
		newGame.setSpot(6,5,black[3]);
		newGame.setSpot(1,6,black[4]);
		newGame.setSpot(3,6,black[5]);
		newGame.setSpot(5,6,black[6]);
		newGame.setSpot(7,6,black[7]);
		newGame.setSpot(0,7,black[8]);
		newGame.setSpot(2,7,black[9]);
		newGame.setSpot(4,7,black[10]);
		newGame.setSpot(5,7,black[11]);
		
		newGame.printBoard();
	}
}