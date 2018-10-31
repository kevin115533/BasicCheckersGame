import CheckersPiece.*;
import Board.*;
import java.util.Scanner;

public class SetupCheckerBoard{
	public static void main (String[] args){
		final int count = 12;
		Scanner input1 = new Scanner(System.in);
		boolean keepGoing = true;

			Board newGame = new Board();
			CheckersPiece[] black = new CheckersPiece[count];	
			CheckersPiece[] red = new CheckersPiece[count];
			
			for(int i = 0;i<count;i++){
				red[i] = new CheckersPiece(Color.R,i,0,0);
			}
		
			for(int i = 0;i<count;i++){
				black[i] = new CheckersPiece(Color.B,i,0,0);
			}
			//manually setting piece coordinates. Couldnt think of a loop to condense it			
			red[0].setCoors(0,1);
			red[1].setCoors(0,3);
			red[2].setCoors(0,5);
			red[3].setCoors(0,7);
			red[4].setCoors(1,0);
			red[5].setCoors(1,2);
			red[6].setCoors(1,4);
			red[7].setCoors(1,6);
			red[8].setCoors(2,1);
			red[9].setCoors(2,3);
			red[10].setCoors(2,5);
			red[11].setCoors(2,7);
			
			black[0].setCoors(5,0);
			black[1].setCoors(5,2);
			black[2].setCoors(5,4);
			black[3].setCoors(5,6);
			black[4].setCoors(6,1);
			black[5].setCoors(6,3);
			black[6].setCoors(6,5);
			black[7].setCoors(6,7);
			black[8].setCoors(7,0);
			black[9].setCoors(7,2);
			black[10].setCoors(7,4);
			black[11].setCoors(7,6);
		
			for(int i = 0;i<count;i++){
				newGame.setSpot(red[i]);
				newGame.setSpot(black[i]);
			
			}
		
			newGame.printBoard();
			
		while(keepGoing == true){
			System.out.println("===================================");
			System.out.println("Player Black turn. Make a move by entering piece number and then coordinates. Example: b1d3");

			String userMove = input1.nextLine();
			char[] stringToArray = userMove.toCharArray();
			int a = Character.getNumericValue(stringToArray[1]);
			char b = stringToArray[2];
			int c = Character.getNumericValue(stringToArray[3]);
			int d = newGame.charConvert(b);
			
			newGame.setSpotNull(black[a]);
			black[a].setCoors(c,d);
			newGame.setSpot(black[a]);
		
			newGame.printBoard();
			
		
			System.out.println("===================================");
			System.out.println("Player Red turn. Make a move by entering piece number and then coordinates. Example: b1d3");

			userMove = input1.nextLine();
			stringToArray = userMove.toCharArray();
			a = Character.getNumericValue(stringToArray[1]);
			b = stringToArray[2];
			c = Character.getNumericValue(stringToArray[3]);
			d = newGame.charConvert(b);
		
			newGame.setSpotNull(red[a]);
			red[a].setCoors(c,d);
			newGame.setSpot(red[a]);		
			
			newGame.printBoard();
		}
	}
}