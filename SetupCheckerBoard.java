import CheckersPiece.*;
import Board.*;
import java.util.*;

public class SetupCheckerBoard{
	public static void main (String[] args){
		final int count = 12;
		String userMove;
		char[] stringToArray;
		char b;
		int d = 0;
		int c = 0;
		int a = 0;
		int exceptionCounter = 0;
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
		
		while(keepGoing == true){
			do{
				exceptionCounter = 0;
				newGame.printBoard();	
				System.out.println("================================================");
				do{
					try{
					System.out.print("Player Black turn, pick a piece number to move: ");
					a = input1.nextInt();
					input1.nextLine();
					exceptionCounter = 1;	
					}
					catch(InputMismatchException ex){
						System.out.println("Not a valid input. Input the piece number only");	
					}
				}while(exceptionCounter == 0);
				
				System.out.print("Pick a coordiate to move to. Example: G5 ");				 
				userMove = input1.nextLine();	
				exceptionCounter = 0;
				
				
				stringToArray = userMove.toCharArray();
				b = stringToArray[0];
				c = Character.getNumericValue(stringToArray[1]);
				d = newGame.charConvert(b);

					try{
						newGame.setSpotNull(black[a]);
						black[a].setCoors(c,d);
						newGame.setSpot(black[a]);
						exceptionCounter = 1;
						}
					catch(ArrayIndexOutOfBoundsException ex){
						System.out.println("Invalid piece or coordinate, try again");	
						}
			}while(exceptionCounter==0);
		
			
			
			do{
				newGame.printBoard();
				System.out.println("================================================");
				System.out.print("Player Red turn, pick a piece number to move: ");
				a = input1.nextInt();
				input1.nextLine();

				System.out.print("Pick a coordiate to move to. Example: G5 ");				 
				userMove = input1.nextLine();
				stringToArray = userMove.toCharArray();
				b = stringToArray[0];
				c = Character.getNumericValue(stringToArray[1]);
				d = newGame.charConvert(b);
				try{
					newGame.setSpotNull(red[a]);
					red[a].setCoors(c,d);
					newGame.setSpot(red[a]);		
					}
				catch(ArrayIndexOutOfBoundsException ex){
						System.out.println("Invalid piece or coordinate, try again");	
						}
			}while(exceptionCounter==0);
		}
	}
}